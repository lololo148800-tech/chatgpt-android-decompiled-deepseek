package p479Td;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import mm.C17314q;
import p040Bd.C1008U1;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;
import p690cp.AbstractC12935u;
import p712dp.C13189e;
import p775h2.AbstractC14376f;
import p909nm.C17689w;

/* JADX INFO: renamed from: Td.F */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C7320F extends AbstractC7343b0 {
    public static final C7318D Companion;

    /* JADX INFO: renamed from: k */
    public static final KSerializer[] f23217k;

    /* JADX INFO: renamed from: l */
    public static final C13189e f23218l;

    /* JADX INFO: renamed from: c */
    public final String f23219c;

    /* JADX INFO: renamed from: d */
    public final boolean f23220d;

    /* JADX INFO: renamed from: e */
    public final List f23221e;

    /* JADX INFO: renamed from: f */
    public final boolean f23222f;

    /* JADX INFO: renamed from: g */
    public final C17314q f23223g;

    /* JADX INFO: renamed from: h */
    public final C17314q f23224h;

    /* JADX INFO: renamed from: i */
    public final C17314q f23225i;

    /* JADX INFO: renamed from: j */
    public final C17314q f23226j;

    static {
        C7318D c7318d = new C7318D();
        Companion = c7318d;
        f23217k = new KSerializer[]{null, null, null, new C11158d(C1008U1.f2803d, 0), null};
        f23218l = new C13189e(C7318D.m7775a(c7318d));
    }

    public C7320F(String content, List references, boolean z6, boolean z10) {
        AbstractC16544l.m18094g(content, "content");
        AbstractC16544l.m18094g(references, "references");
        this.f23219c = content;
        this.f23220d = z6;
        this.f23221e = references;
        this.f23222f = z10;
        this.f23223g = AbstractC9227W.m9800c(new C7319E(this, 0));
        this.f23224h = AbstractC9227W.m9800c(new C7319E(this, 1));
        this.f23225i = AbstractC9227W.m9800c(new C7319E(this, 2));
        this.f23226j = AbstractC9227W.m9800c(new C7319E(this, 3));
    }

    /* JADX INFO: renamed from: c */
    public static C7320F m7776c(C7320F c7320f, String content) {
        boolean z6 = c7320f.f23220d;
        List references = c7320f.f23221e;
        boolean z10 = c7320f.f23222f;
        c7320f.getClass();
        AbstractC16544l.m18094g(content, "content");
        AbstractC16544l.m18094g(references, "references");
        return new C7320F(content, references, z6, z10);
    }

    @Override // p479Td.AbstractC7343b0
    /* JADX INFO: renamed from: a */
    public final boolean mo7777a() {
        return ((Boolean) this.f23226j.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC12935u m7778d() {
        Object value = this.f23225i.getValue();
        AbstractC16544l.m18093f(value, "getValue(...)");
        return (AbstractC12935u) value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7320F)) {
            return false;
        }
        C7320F c7320f = (C7320F) obj;
        return AbstractC16544l.m18089b(this.f23219c, c7320f.f23219c) && this.f23220d == c7320f.f23220d && AbstractC16544l.m18089b(this.f23221e, c7320f.f23221e) && this.f23222f == c7320f.f23222f;
    }

    public final int hashCode() {
        return AbstractC14376f.m15858x(this.f23221e, ((this.f23219c.hashCode() * 31) + (this.f23220d ? 1231 : 1237)) * 31, 31) + (this.f23222f ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7320F(int i10, boolean z6, String str, boolean z10, List list, boolean z11) {
        super(i10, z6);
        if (2 != (i10 & 2)) {
            AbstractC11153a0.m12389l(i10, 2, C7316B.f23213a.getDescriptor());
            throw null;
        }
        this.f23219c = str;
        if ((i10 & 4) == 0) {
            this.f23220d = false;
        } else {
            this.f23220d = z10;
        }
        if ((i10 & 8) == 0) {
            this.f23221e = C17689w.f56480Y;
        } else {
            this.f23221e = list;
        }
        if ((i10 & 16) == 0) {
            this.f23222f = false;
        } else {
            this.f23222f = z11;
        }
        this.f23223g = AbstractC9227W.m9800c(new C7319E(this, 0));
        this.f23224h = AbstractC9227W.m9800c(new C7319E(this, 1));
        this.f23225i = AbstractC9227W.m9800c(new C7319E(this, 2));
        this.f23226j = AbstractC9227W.m9800c(new C7319E(this, 3));
    }

    public /* synthetic */ C7320F(int i10, String str, List list, boolean z6, boolean z10) {
        this(str, (i10 & 4) != 0 ? C17689w.f56480Y : list, (i10 & 2) != 0 ? false : z6, (i10 & 8) != 0 ? false : z10);
    }
}
