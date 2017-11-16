package nudt.pdl.minibitcoin.bitcoin.interfaces;

import java.util.Queue;

import nudt.pdl.minibitcoin.bitcoin.data_model.Data;

public interface Receiver {

    public Queue<Data> getQueue();

    public boolean isReady();

    public String getHost();

    public int getPort();
}
