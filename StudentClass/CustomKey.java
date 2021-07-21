package StudentClass;

public class CustomKey 
{
  private long id;
  private String name;
   
  public CustomKey(final Student student) 
  {
    this.id = student.getID();
    this.name = student.getName();
  }
   
  @Override
  public int hashCode()
  {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (id ^ (id >>> 32));
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }
   
  @Override
  public boolean equals(Object obj) 
  {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    CustomKey other = (CustomKey) obj;
    if (id != other.id)
      return false;
    if (name == null) 
    {
      if (other.name != null)
        return false;
    } 
    else if (!name.equals(other.name))
      return false;
    return true;
  }
}