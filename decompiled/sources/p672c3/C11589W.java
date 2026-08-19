package p672c3;

import android.content.Context;
import com.openai.feature.widget.impl.WidgetReceiver;
import java.util.ArrayList;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: c3.W */
/* JADX INFO: loaded from: classes.dex */
public final class C11589W extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f35063Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f35064Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ WidgetReceiver f35065o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Context f35066p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int[] f35067q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11589W(WidgetReceiver widgetReceiver, Context context, int[] iArr, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f35065o0 = widgetReceiver;
        this.f35066p0 = context;
        this.f35067q0 = iArr;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C11589W c11589w = new C11589W(this.f35065o0, this.f35066p0, this.f35067q0, interfaceC18770c);
        c11589w.f35064Z = obj;
        return c11589w;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11589W) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f35063Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f35064Z;
            WidgetReceiver widgetReceiver = this.f35065o0;
            Context context = this.f35066p0;
            WidgetReceiver.m14390a(widgetReceiver, interfaceC0571F, context);
            int[] iArr = this.f35067q0;
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i11 : iArr) {
                arrayList.add(AbstractC0575H.m1177f(interfaceC0571F, null, new C11588V(widgetReceiver, context, i11, null), 3));
            }
            this.f35063Y = 1;
            if (AbstractC0575H.m1178g(arrayList, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
