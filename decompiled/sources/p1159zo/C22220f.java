package p1159zo;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.jvm.internal.AbstractC16544l;
import p026Ao.C0678l;
import p950po.AbstractC18527a;

/* JADX INFO: renamed from: zo.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C22220f extends AbstractC18527a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C22221g f70414e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f70415f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22220f(String str, C22221g c22221g, long j10) {
        super(str, true);
        this.f70414e = c22221g;
        this.f70415f = j10;
    }

    @Override // p950po.AbstractC18527a
    /* JADX INFO: renamed from: a */
    public final long mo19887a() {
        C22224j c22224j;
        C22221g c22221g = this.f70414e;
        synchronized (c22221g) {
            try {
                if (!c22221g.f70436t && (c22224j = c22221g.f70426j) != null) {
                    int i10 = c22221g.f70438v ? c22221g.f70437u : -1;
                    c22221g.f70437u++;
                    c22221g.f70438v = true;
                    if (i10 != -1) {
                        StringBuilder sb2 = new StringBuilder("sent ping but didn't receive pong within ");
                        sb2.append(c22221g.f70419c);
                        sb2.append("ms (after ");
                        c22221g.m22407c(new SocketTimeoutException(AbstractC10763a.m11056n(sb2, i10 - 1, " successful ping/pongs)")), null);
                    } else {
                        try {
                            C0678l payload = C0678l.f1971p0;
                            AbstractC16544l.m18094g(payload, "payload");
                            c22224j.m22417a(9, payload);
                        } catch (IOException e10) {
                            c22221g.m22407c(e10, null);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f70415f;
    }
}
