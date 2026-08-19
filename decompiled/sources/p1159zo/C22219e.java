package p1159zo;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;
import p950po.AbstractC18527a;
import p974qo.C18792h;

/* JADX INFO: renamed from: zo.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C22219e extends AbstractC18527a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f70412e = 1;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C22221g f70413f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22219e(String str, C22221g c22221g) {
        super(str, true);
        this.f70413f = c22221g;
    }

    @Override // p950po.AbstractC18527a
    /* JADX INFO: renamed from: a */
    public final long mo19887a() {
        switch (this.f70412e) {
            case 0:
                C22221g c22221g = this.f70413f;
                try {
                    return c22221g.m22414j() ? 0L : -1L;
                } catch (IOException e10) {
                    c22221g.m22407c(e10, null);
                }
                break;
            default:
                C18792h c18792h = this.f70413f.f70423g;
                AbstractC16544l.m18091d(c18792h);
                c18792h.cancel();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22219e(C22221g c22221g) {
        super(AbstractC9306j0.m9891j(c22221g.f70428l, " writer", new StringBuilder()), true);
        this.f70413f = c22221g;
    }
}
