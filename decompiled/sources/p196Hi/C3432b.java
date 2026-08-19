package p196Hi;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.openai.feature.rootviewmodel.RootViewModel;
import com.openai.feature.rootviewmodel.RootViewModelProvider;
import com.openai.voice.assistant.AssistantActivity;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import ni.C17632f;
import ni.C17633g;
import p049Bm.InterfaceC1439n;
import p092Dc.C1998o;
import p349O0.C5997d;
import p349O0.C6014l0;
import p349O0.C6021p;
import p478Tc.AbstractC7308l;
import p537W0.AbstractC8411c;
import p553Wh.AbstractC8871g;
import p553Wh.AbstractC8873i;
import p571X9.AbstractC9112C3;
import ug.AbstractC20236s;

/* JADX INFO: renamed from: Hi.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C3432b extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10450Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AssistantActivity f10451Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3432b(AssistantActivity assistantActivity, int i10) {
        super(2);
        this.f10450Y = i10;
        this.f10451Z = assistantActivity;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) throws C17633g {
        C17296C c17296c = C17296C.f55119a;
        AssistantActivity assistantActivity = this.f10451Z;
        int i10 = 1;
        int i11 = 0;
        switch (this.f10450Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    Object objM19235b = C17632f.f56419a.m19235b(RootViewModelProvider.class);
                    if (objM19235b == null) {
                        throw new C17633g(AbstractC10763a.m11055m("No ", RootViewModelProvider.class.getName(), " in ", C17632f.m19233c()));
                    }
                    AbstractC20236s abstractC20236s = (AbstractC20236s) AbstractC9112C3.m9642d(((RootViewModel) ((C1998o) ((RootViewModelProvider) objM19235b)).f6055l0.get()).f40343c, c6021p).getValue();
                    AbstractC16421b.m18008a(new Object[]{abstractC20236s.mo21016e()}, AbstractC8411c.m8969c(1902642256, c6021p, new C3431a(abstractC20236s, assistantActivity, i10)), c6021p, 48);
                }
                return c17296c;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C5997d.m6442b(new C6014l0[]{AbstractC7308l.f23151a.mo6405a(assistantActivity), AbstractC8873i.f27157a.mo6405a(AbstractC8871g.m9550a(null, c6021p2, 63))}, AbstractC8411c.m8969c(-1224130209, c6021p2, new C3432b(assistantActivity, i11)), c6021p2, 56);
                }
                return c17296c;
        }
    }
}
