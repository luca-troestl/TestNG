package conwaysGameOfLife;

class Cell {
    private boolean isAlive;
    
    public Cell() {
        this.isAlive = false;
    }
    
    public boolean isAlive() {
        return isAlive;
    }
    
    public void setAlive(boolean alive) {
        this.isAlive = alive;
    }
}