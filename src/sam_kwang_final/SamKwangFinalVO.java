package sam_kwang_final;

public class SamKwangFinalVO {
    private int custno; //고객번호
    private int ordno; //주문번호
    private int transID; //운송ID
    private int empno; //인사번호
    private int prodno; //제품번호

    public SamKwangFinalVO() {
    }

    public SamKwangFinalVO(int custno, int ordno, int transID, int empno, int prodno) {
        this.custno = custno;
        this.ordno = ordno;
        this.transID = transID;
        this.empno = empno;
        this.prodno = prodno;
    }

    public int getCustno() {
        return custno;
    }

    public void setCustno(int custno) {
        this.custno = custno;
    }

    public int getOrdno() {
        return ordno;
    }

    public void setOrdno(int ordno) {
        this.ordno = ordno;
    }

    public int getTransID() {
        return transID;
    }

    public void setTransID(int transID) {
        this.transID = transID;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public int getProdno() {
        return prodno;
    }

    public void setProdno(int prodno) {
        this.prodno = prodno;
    }
}
