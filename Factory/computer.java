package facctory.model;

public abstract class Computer {
    private abstract String getRAM();
    private abstract String getHDD();
    private abstract String getCPU();

    @override
    public String toString(){
		return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}
