package p556Wk;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import io.ktor.utils.p815io.InterfaceC15088n;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import ml.AbstractC17286d;
import p023Al.C0559e;
import p025An.AbstractC0593T;
import p048Bl.AbstractC1423b;
import p048Bl.C1422a;
import p1089wl.AbstractC21011e;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p488Tn.C7519b;
import p754fl.C13693c;
import p857kl.AbstractC16435B;
import p857kl.AbstractC16457e;
import p857kl.C16460h;
import p857kl.C16477y;

/* JADX INFO: renamed from: Wk.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C8931m extends AbstractC17286d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f27310a = 1;

    /* JADX INFO: renamed from: b */
    public final Long f27311b;

    /* JADX INFO: renamed from: c */
    public final C16460h f27312c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f27313d;

    public C8931m(C13693c c13693c, C16460h c16460h, Object obj) {
        this.f27313d = obj;
        C16477y c16477y = c13693c.f43197c;
        List list = AbstractC16435B.f50983a;
        String strM4540z = c16477y.m4540z(SIPHeaderNames.CONTENT_LENGTH);
        this.f27311b = strM4540z != null ? Long.valueOf(Long.parseLong(strM4540z)) : null;
        if (c16460h == null) {
            C16460h c16460h2 = AbstractC16457e.f51060a;
            c16460h = AbstractC16457e.f51061b;
        }
        this.f27312c = c16460h;
    }

    @Override // ml.AbstractC17288f
    /* JADX INFO: renamed from: a */
    public final Long mo7529a() {
        switch (this.f27310a) {
            case 0:
                break;
        }
        return this.f27311b;
    }

    @Override // ml.AbstractC17288f
    /* JADX INFO: renamed from: b */
    public final C16460h mo7530b() {
        switch (this.f27310a) {
            case 0:
                break;
        }
        return this.f27312c;
    }

    @Override // ml.AbstractC17286d
    /* JADX INFO: renamed from: e */
    public final InterfaceC15088n mo7533e() {
        Object obj = this.f27313d;
        switch (this.f27310a) {
            case 0:
                return (InterfaceC15088n) obj;
            default:
                InputStream inputStream = (InputStream) obj;
                C3516e c3516e = AbstractC0593T.f1824a;
                ExecutorC3515d context = ExecutorC3515d.f10633Z;
                C1422a pool = AbstractC1423b.f3805a;
                AbstractC16544l.m18094g(inputStream, "<this>");
                AbstractC16544l.m18094g(context, "context");
                AbstractC16544l.m18094g(pool, "pool");
                return new C0559e(new C7519b(inputStream), context);
        }
    }

    public C8931m(AbstractC21011e abstractC21011e, C16460h c16460h, Object obj) {
        this.f27313d = obj;
        C16477y c16477y = ((C13693c) abstractC21011e.f66872Y).f43197c;
        List list = AbstractC16435B.f50983a;
        String strM4540z = c16477y.m4540z(SIPHeaderNames.CONTENT_LENGTH);
        this.f27311b = strM4540z != null ? Long.valueOf(Long.parseLong(strM4540z)) : null;
        if (c16460h == null) {
            C16460h c16460h2 = AbstractC16457e.f51060a;
            c16460h = AbstractC16457e.f51061b;
        }
        this.f27312c = c16460h;
    }
}
