/*
 * Instance of this class (PersonImmutable) will be immutable
 * i.e., once created cannot have their field values changed.
 * This is accomplished by simply NOT providing any public methods (e.g., setters)
 * to do so.
 */
class PersonImmutable
{
    private String name;
    private Integer age;

    public PersonImmutable(String name, Integer age)
    {
        this.name = name;
        this.age = age;

    }


    public String getName()
    {
        return name;
    }

    public Integer getAge()
    {
        return age;
    }

    @Override
    public String toString()
    {
        return "PersonImmutable{" + "name='" + getName() + '\'' + ", age=" + getAge() + '}';
    }
}
