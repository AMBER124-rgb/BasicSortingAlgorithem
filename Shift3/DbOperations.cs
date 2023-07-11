using Microsoft.Data.SqlClient;
using Shift3.Models;
using System.Data.SqlTypes;

namespace Shift3
{
    public class DbOperations
    {
        private static SqlConnection Connection() 
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=B4;Integrated Security=True;";
            return cn;

        }

        public static List<student> GetAllStudents()
        {
            List<student> list = new List<student>();

            SqlConnection cn = Connection();
            SqlCommand cmd = new SqlCommand();
            cmd.Connection = cn;
            cmd.CommandType = System.Data.CommandType.Text;
            cmd.CommandText = "select * from Students";
            cn.Open();

            SqlDataReader dr = cmd.ExecuteReader();

            while (dr.Read())
            {
                list.Add(new student
                {
                    StudentNo = (int)dr["StudentNo"],
                    Name= (string)dr["Name"],
                    Section = (string)dr["Section"],
                    Branch = (string)dr["Branch"],
                    Email = (string)dr["Email"]
                });
            }
            return list;
        }
        public static student GetSingleStudent(int id) 
        {
            SqlConnection cn = Connection();
            SqlCommand cmd = new SqlCommand();
            cmd.Connection = cn;
            cmd.CommandType = System.Data.CommandType.Text;
            cmd.CommandText = "select * from Students where StudentNo=@StudentNo";
            cmd.Parameters.AddWithValue("@StudentNo", id);
            cn.Open();
            student s = null;
            SqlDataReader dr = cmd.ExecuteReader();
            while (dr.Read())
            {
                s = new student
                {
                    StudentNo = (int)dr["StudentNo"],
                    Name = (string)dr["Name"],
                    Section = (string)dr["Section"],
                    Branch = (string)dr["Branch"],
                    Email = (string)dr["Email"]
                };

            
            }
            return s;

        
        }

        public static void AddStudent(student stud)
        { 
        SqlConnection cn = Connection();
            SqlCommand cmd = new SqlCommand();
            cmd.Connection = cn;
            cmd.CommandType= System.Data.CommandType.Text;
            cmd.CommandText = "insert into Students values(@Name,@Section,@Branch,@Email)";

            cmd.Parameters.AddWithValue("@Name", stud.Name);
            cmd.Parameters.AddWithValue("@Section", stud.Section);
            cmd.Parameters.AddWithValue("@Branch", stud.Branch);
            cmd.Parameters.AddWithValue("@Email", stud.Email);
            cn.Open();
            try
            {
                cmd.ExecuteNonQuery();
            }
            catch (Exception ex)
            {

                throw new Exception(ex.Message);
            }
        }

        public static void EditStudent(student stud)
        { 
        SqlConnection cn =Connection();
            SqlCommand cmd = new SqlCommand();
            cmd.Connection = cn;
            cmd.CommandType=System.Data.CommandType.Text;
            cmd.CommandText = "update Students set Name=@Name,Branch=@Branch,Section=@Section,Email=@Email where StudentNo=@StudentNo";

            cmd.Parameters.AddWithValue("@Name", stud.Name);
            cmd.Parameters.AddWithValue("@Section", stud.Section);
            cmd.Parameters.AddWithValue("@Branch", stud.Branch);
            cmd.Parameters.AddWithValue("@Email", stud.Email);
            cmd.Parameters.AddWithValue("@StudentNo", stud.StudentNo);
            cn.Open();
            try
            {
                cmd.ExecuteNonQuery();
            }
            catch (Exception ex)
            {

                throw new Exception(ex.Message);
            }
        }

        public static void DeleteStudent(int id)
        {

            SqlConnection cn = Connection();
            SqlCommand cmd = new SqlCommand();
            cmd.Connection = cn;
            cmd.CommandType = System.Data.CommandType.Text;
            cmd.CommandText = "Delete from Students where StudentNo=@StudentNo";

            cmd.Parameters.AddWithValue("@StudentNo", id);

            cn.Open();

            try
            {
                cmd.ExecuteNonQuery();
            }
            catch (Exception ex)
            {
                throw new Exception(ex.Message);
            }

        }
    }
}
