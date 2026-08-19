package p389Pn;

import android.javax.sip.C10808o;
import com.google.protobuf.AbstractC12107L1;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0292u;
import p412Qn.C6760a;
import p412Qn.InterfaceC6762c;
import p437Rn.C6960r;
import p437Rn.C6966x;
import p571X9.AbstractC9393x3;
import p909nm.C17689w;

/* JADX INFO: renamed from: Pn.n */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6529n implements InterfaceC6526k {

    /* JADX INFO: renamed from: a */
    public final C6538w f21142a;

    /* JADX INFO: renamed from: b */
    public final List f21143b;

    /* JADX INFO: renamed from: c */
    public final String f21144c;

    public AbstractC6529n(C6538w field, List list, String str) {
        AbstractC16544l.m18094g(field, "field");
        this.f21142a = field;
        this.f21143b = list;
        this.f21144c = str;
        int size = list.size();
        int i10 = (field.f21158c - field.f21157b) + 1;
        if (size == i10) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("The number of values (");
        sb2.append(list.size());
        sb2.append(") in ");
        sb2.append(list);
        sb2.append(" does not match the range of the field (");
        throw new IllegalArgumentException(AbstractC12107L1.m13826q(sb2, i10, ')').toString());
    }

    @Override // p389Pn.InterfaceC6526k
    /* JADX INFO: renamed from: a */
    public final InterfaceC6762c mo6320a() {
        return new C6760a(new C0292u(1, this, AbstractC6529n.class, "getStringValue", "getStringValue(Ljava/lang/Object;)Ljava/lang/String;", 0, 17));
    }

    @Override // p389Pn.InterfaceC6526k
    /* JADX INFO: renamed from: b */
    public final C6960r mo6321b() {
        List list = this.f21143b;
        return new C6960r(AbstractC9393x3.m9974d(new C6966x(list, new C10808o(this, 21), "one of " + list + " for " + this.f21144c)), C17689w.f56480Y);
    }

    @Override // p389Pn.InterfaceC6526k
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ AbstractC6516a mo6322c() {
        return this.f21142a;
    }
}
