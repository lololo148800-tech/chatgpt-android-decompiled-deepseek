package p339Nf;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import com.openai.feature.messages.MessagesViewModel;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p349O0.C5997d;
import p349O0.C6014l0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p537W0.AbstractC8411c;
import p911o0.C17794y;

/* JADX INFO: renamed from: Nf.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C5735q extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Configuration f18632Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Context f18633Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f18634o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f18635p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ String f18636q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ List f18637r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ List f18638s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ List f18639t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ MessagesViewModel f18640u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ List f18641v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ InterfaceC5985X f18642w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5735q(Configuration configuration, Context context, InterfaceC5985X interfaceC5985X, String str, String str2, List list, List list2, List list3, MessagesViewModel messagesViewModel, List list4, InterfaceC5985X interfaceC5985X2) {
        super(3);
        this.f18632Y = configuration;
        this.f18633Z = context;
        this.f18634o0 = interfaceC5985X;
        this.f18635p0 = str;
        this.f18636q0 = str2;
        this.f18637r0 = list;
        this.f18638s0 = list2;
        this.f18639t0 = list3;
        this.f18640u0 = messagesViewModel;
        this.f18641v0 = list4;
        this.f18642w0 = interfaceC5985X2;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C17794y ModalBottomSheet = (C17794y) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(ModalBottomSheet, "$this$ModalBottomSheet");
        if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C5997d.m6442b(new C6014l0[]{AndroidCompositionLocals_androidKt.f32824a.mo6405a(this.f18632Y), AndroidCompositionLocals_androidKt.f32825b.mo6405a(this.f18633Z)}, AbstractC8411c.m8969c(239196408, c6021p, new C5734p(this.f18634o0, this.f18635p0, this.f18636q0, this.f18637r0, this.f18638s0, this.f18639t0, this.f18640u0, this.f18641v0, this.f18642w0)), c6021p, 56);
        }
        return C17296C.f55119a;
    }
}
