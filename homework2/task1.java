// В файле содержится строка с исходными данными в такой форме:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
// Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.

package homework2;

import java.io.FileReader;
import java.io.IOException;

public class task1 
{
    public static void main(String[] args)
    {
        FileReader reader = null;
        char buffer[] = new char[100];
        try
        {
            {   
                reader = new FileReader("text.txt");
                reader.read(buffer);
                String str1 = new String(buffer);
                str1 = str1.replaceAll("[{}]", "");
                String[] str2 = str1.split(":|, ");
                for (int i = 0; i < str2.length; i++)
                {
                    System.out.println(str2[i]);            
                }
                StringBuilder builder = new StringBuilder("SELECT * FROM students WHERE ");
                if (!str2[1].contains("null")) 
                {
                    builder.append(str2[0].replace("\"", ""));
                    builder.append(" = ");
                    builder.append(str2[1]);
                }
                if (!str2[3].contains("null")) 
                {
                    builder.append(" AND ");
                    builder.append(str2[2].replace("\"", ""));
                    builder.append(" = ");
                    builder.append(str2[3]);
                }
                if (!str2[5].contains("null")) 
                {
                    builder.append(" AND ");
                    builder.append(str2[4].replace("\"", ""));
                    builder.append(" = ");
                    builder.append(str2[5]);
                }
                if (!str2[7].contains("null")) 
                {
                    builder.append(" AND ");
                    builder.append(str2[6].replace("\"", ""));
                    builder.append(" = ");
                    builder.append(str2[7]);
                }
                System.out.println(builder);
            }
        }
        catch (IOException ex)
        {
            System.out.println("Ошибка чтения файла");
        }
        finally
        {
            try 
            {
                reader.close();
            } 
            catch (IOException ex) 
            {
                System.out.println("Ошибка закрытия файла");;
            }
        }
    }    
}
