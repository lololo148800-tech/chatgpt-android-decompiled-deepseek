package p949pj;

import android.graphics.Rect;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import mm.C17312o;
import p468T2.C7224p;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: pj.H */
/* JADX INFO: loaded from: classes3.dex */
public final class C18435H extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C18438K f58806Y;

    /* JADX INFO: renamed from: Z */
    public C7224p f58807Z;

    /* JADX INFO: renamed from: o0 */
    public List f58808o0;

    /* JADX INFO: renamed from: p0 */
    public Rect f58809p0;

    /* JADX INFO: renamed from: q0 */
    public Iterator f58810q0;

    /* JADX INFO: renamed from: r0 */
    public Collection f58811r0;

    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ Object f58812s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C18438K f58813t0;

    /* JADX INFO: renamed from: u0 */
    public int f58814u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18435H(C18438K c18438k, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f58813t0 = c18438k;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f58812s0 = obj;
        this.f58814u0 |= Integer.MIN_VALUE;
        Object objM19874h = C18438K.m19874h(this.f58813t0, null, this);
        return objM19874h == EnumC19250a.f61036Y ? objM19874h : new C17312o(objM19874h);
    }
}
