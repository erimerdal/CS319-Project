package map;

public class GenericUnit {
    private final int MAX_COUNT = 100;
    private final int BASE_WAGE = 1;
    private int wage;
    private int cost;
    private boolean isBeingRecruited;
    private boolean isMoved;
    private int ownerId;
    private int count;

    public GenericUnit()
    {
        wage = 0;
        cost = 0;
        isBeingRecruited = false;
        isMoved = false;
        ownerId = -1;
    }

    public void setCost(int cost)
    {
        this.cost = cost;
    }
    public void setOwnerId(int ownerId)
    {
        this.ownerId = ownerId;
    }
    public void setIsBeingRecruited(boolean isBeingRecruited)
    {
        this.isBeingRecruited = isBeingRecruited;
    }
    public void setIsMoved(boolean isMoved)
    {
        this.isMoved = isMoved;
    }
    public int getWage()
    {
        return wage;
    }
    public int getCost()
    {
        return cost;
    }
    public int getOwnerId()
    {
        return ownerId;
    }
    public boolean getIsMoved()
    {
        return isMoved;
    }
    public boolean getIsBeingRecruited()
    {
        return isBeingRecruited;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        if(count < 0 || count > MAX_COUNT)
            return;

        this.count = count;
        wage = count * BASE_WAGE;
    }
}
