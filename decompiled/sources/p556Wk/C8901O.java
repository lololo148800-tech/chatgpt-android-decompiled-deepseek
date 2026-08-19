package p556Wk;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.InterfaceC0648y;

/* JADX INFO: renamed from: Wk.O */
/* JADX INFO: loaded from: classes3.dex */
public final class C8901O extends IOException implements InterfaceC0648y {

    /* JADX INFO: renamed from: Y */
    public final String f27243Y;

    /* JADX INFO: renamed from: Z */
    public final Long f27244Z;

    public C8901O(String url, Long l4, Throwable th2) {
        AbstractC16544l.m18094g(url, "url");
        StringBuilder sb2 = new StringBuilder("Request timeout has expired [url=");
        sb2.append(url);
        sb2.append(", request_timeout=");
        sb2.append(l4 == null ? "unknown" : l4);
        sb2.append(" ms]");
        super(sb2.toString(), th2);
        this.f27243Y = url;
        this.f27244Z = l4;
    }

    @Override // p025An.InterfaceC0648y
    /* JADX INFO: renamed from: a */
    public final Throwable mo1152a() {
        return new C8901O(this.f27243Y, this.f27244Z, getCause());
    }
}
