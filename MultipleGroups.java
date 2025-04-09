public class MultipleGroups implements NumberGroup
{
    private List<NumberGroup> groupList;

    public MultipleGroups(NumberGroup g1)
    {
        groupList.add(g1);
    }
    public boolean Contains(int val)
    {
        for(NumberGroup x: groupList)
            for(int i: x)
                if(i=val)
                    return true;
    }
}
