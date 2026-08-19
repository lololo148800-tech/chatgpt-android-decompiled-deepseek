package p320Mj;

import com.withpersona.sdk2.inquiry.internal.fallbackmode.C12869g;
import mm.C17312o;
import p342Nj.C5813g;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Mj.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C5452e extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f17799Y;

    /* JADX INFO: renamed from: Z */
    public C5813g f17800Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f17801o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C12869g f17802p0;

    /* JADX INFO: renamed from: q0 */
    public int f17803q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5452e(C12869g c12869g, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f17802p0 = c12869g;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f17801o0 = obj;
        this.f17803q0 |= Integer.MIN_VALUE;
        Object objMo5907b = this.f17802p0.mo5907b(null, this);
        return objMo5907b == EnumC19250a.f61036Y ? objMo5907b : new C17312o(objMo5907b);
    }
}
