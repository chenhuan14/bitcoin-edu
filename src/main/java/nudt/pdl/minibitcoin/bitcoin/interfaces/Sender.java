package nudt.pdl.minibitcoin.bitcoin.interfaces;

import java.util.Queue;

import nudt.pdl.minibitcoin.bitcoin.data_model.Data;

public interface Sender {

    public Queue<Data> getQueue();

    public boolean isReady();
}
