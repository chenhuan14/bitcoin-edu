package nudt.pdl.minibitcoin;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;



//@formatter:off
@RunWith(Suite.class)
@SuiteClasses(
    {
       nudt.pdl.minibitcoin.ProofOfWorkTest.class,
       nudt.pdl.minibitcoin.BlockChainTest.class,
       nudt.pdl.minibitcoin.EncodeDecodeTest.class,
       nudt.pdl.minibitcoin.TransactionTest.class,
       nudt.pdl.minibitcoin.BlockTest.class,
       nudt.pdl.minibitcoin.DataTest.class,
       nudt.pdl.minibitcoin.UDPTest.class,
       nudt.pdl.minibitcoin.TCPTest.class,
       nudt.pdl.minibitcoin.MulticastTest.class,
       nudt.pdl.minibitcoin.PeerTest.class,
       nudt.pdl.minibitcoin.WalletTest.class,
    }
)
//@formatter:on

public class AllTest {
    // Ignore
}
