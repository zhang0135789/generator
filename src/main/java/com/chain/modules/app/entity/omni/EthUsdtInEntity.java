package com.chain.modules.app.entity.omni;

public class EthUsdtInEntity {
    private Integer id;

    private String txid;

    private String amount;

    private String confirmations;

    private String account;

    private String label;

    private String address;

    private String blockhash;

    private String blockindex;

    private String blocktime;

    private String time;

    private String timereceived;

    private String date;

    private String block;

    private Integer status;

    private String isSend;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid == null ? null : txid.trim();
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount == null ? null : amount.trim();
    }

    public String getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(String confirmations) {
        this.confirmations = confirmations == null ? null : confirmations.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getBlockhash() {
        return blockhash;
    }

    public void setBlockhash(String blockhash) {
        this.blockhash = blockhash == null ? null : blockhash.trim();
    }

    public String getBlockindex() {
        return blockindex;
    }

    public void setBlockindex(String blockindex) {
        this.blockindex = blockindex == null ? null : blockindex.trim();
    }

    public String getBlocktime() {
        return blocktime;
    }

    public void setBlocktime(String blocktime) {
        this.blocktime = blocktime == null ? null : blocktime.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getTimereceived() {
        return timereceived;
    }

    public void setTimereceived(String timereceived) {
        this.timereceived = timereceived == null ? null : timereceived.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block == null ? null : block.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getIsSend() {
        return isSend;
    }

    public void setIsSend(String isSend) {
        this.isSend = isSend == null ? null : isSend.trim();
    }
}