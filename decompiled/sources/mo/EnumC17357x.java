package mo;

/* JADX INFO: renamed from: mo.x */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC17357x {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: Y */
    public final String f55378Y;

    EnumC17357x(String str) {
        this.f55378Y = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f55378Y;
    }
}
