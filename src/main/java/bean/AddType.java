package bean;

public enum AddType {
    BITCOIN("btc"),
    ETHEREUM("eth"),
    ETHEREUMCLASSIC("etc"),
    HUOBI_ECO_CHAIN("heco"),
    BINANCE_SMART_CHAIN("bsc"),
    OKEXCHAIN("okt"),
    TRON("trx"),
    USDT_ERC20("usdt_erc20"),
    USDT_TRC20("usdt_trc20"),
    USDT_OMNI("usdt_omni"),
    EOS("eos"),
    BITCOIN_CASH("bch"),
    FILECOIN("fil"),
    BITCOIN_SV("bsv"),
    VECHAIN("vet"),
    POLYGON("matic"),
    LITECOIN("ltc"),
    DASH("dash"),
    DOGECOIN("doge"),
    COSMOS("atom"),
    MONERO("xmr"),
    WAVES("waves"),
    RIPPLE("xrp"),
    BNB("bnb"),
    NEO("neo"),
    ONT("ont"),
    STELLER("xlm"),
    POTE("pote"),
    CLUB("club")
    ;

    String type;

    AddType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
