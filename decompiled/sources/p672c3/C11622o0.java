package p672c3;

import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p351O2.InterfaceC6094h;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: c3.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11622o0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f35218Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Context f35219Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11622o0(Context context, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f35219Z = context;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C11622o0(this.f35219Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11622o0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f35218Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            Context context = this.f35219Z;
            C11584Q c11584q = new C11584Q(context);
            this.f35218Y = 1;
            String packageName = context.getPackageName();
            List<AppWidgetProviderInfo> installedProviders = c11584q.f35036b.getInstalledProviders();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : installedProviders) {
                if (AbstractC16544l.m18089b(((AppWidgetProviderInfo) obj2).provider.getPackageName(), packageName)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((AppWidgetProviderInfo) it.next()).provider.getClassName());
            }
            Object objMo6651b = ((InterfaceC6094h) c11584q.f35037c.getValue()).mo6651b(new C11582O(AbstractC17680n.m19328G0(arrayList2), null), this);
            if (objMo6651b != EnumC19250a.f61036Y) {
                objMo6651b = c17296c;
            }
            if (objMo6651b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
