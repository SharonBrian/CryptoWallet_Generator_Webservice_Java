package webservice;

import bean.AddType;
import cn.hutool.http.HttpUtil;
import org.testng.annotations.Test;

public class CryptoWalletGeneratorTest {

    public void generator(String addTypeStr) {
        String url = "https://tokenwallet.one/create/" + addTypeStr;
        try {
            String result = HttpUtil.get(url);
            System.out.println(addTypeStr + " generated Wallet:" + result);
        } catch (Exception e) {
            System.out.println(addTypeStr + " request failed..." + e.getMessage());
        }
    }

    @Test
    public void generatorTest() {
        generator(AddType.BITCOIN.getType());
        generator(AddType.ETHEREUM.getType());
        generator(AddType.ETHEREUMCLASSIC.getType());
        generator(AddType.HUOBI_ECO_CHAIN.getType());
        generator(AddType.BINANCE_SMART_CHAIN.getType());
        generator(AddType.OKEXCHAIN.getType());
        generator(AddType.TRON.getType());
        generator(AddType.USDT_ERC20.getType());
        generator(AddType.USDT_OMNI.getType());
        generator(AddType.USDT_TRC20.getType());
        generator(AddType.EOS.getType());
        generator(AddType.BITCOIN_CASH.getType());
        generator(AddType.FILECOIN.getType());
        generator(AddType.BITCOIN_SV.getType());
        generator(AddType.VECHAIN.getType());
        generator(AddType.POLYGON.getType());
        generator(AddType.LITECOIN.getType());
        generator(AddType.DASH.getType());
        generator(AddType.DOGECOIN.getType());
        generator(AddType.COSMOS.getType());
        generator(AddType.MONERO.getType());
        generator(AddType.WAVES.getType());
        generator(AddType.RIPPLE.getType());
        generator(AddType.BNB.getType());
        generator(AddType.NEO.getType());
        generator(AddType.ONT.getType());
        generator(AddType.STELLER.getType());
        generator(AddType.POTE.getType());
        generator(AddType.CLUB.getType());
    }

}
