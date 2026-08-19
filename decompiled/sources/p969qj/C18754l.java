package p969qj;

import android.graphics.Rect;
import java.util.Iterator;
import kotlin.jvm.internal.C16525B;
import mm.C17312o;
import p468T2.C7224p;
import p949pj.EnumC18448V;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: qj.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C18754l extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C7224p f59632Y;

    /* JADX INFO: renamed from: Z */
    public Rect f59633Z;

    /* JADX INFO: renamed from: o0 */
    public C16525B f59634o0;

    /* JADX INFO: renamed from: p0 */
    public Iterator f59635p0;

    /* JADX INFO: renamed from: q0 */
    public EnumC18448V f59636q0;

    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ Object f59637r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C18755m f59638s0;

    /* JADX INFO: renamed from: t0 */
    public int f59639t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18754l(C18755m c18755m, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f59638s0 = c18755m;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f59637r0 = obj;
        this.f59639t0 |= Integer.MIN_VALUE;
        Object objMo20046a = this.f59638s0.mo20046a(null, null, this);
        return objMo20046a == EnumC19250a.f61036Y ? objMo20046a : new C17312o(objMo20046a);
    }
}
