package p561X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.view.View;
import androidx.camera.view.PreviewView;
import com.squareup.workflow1.p685ui.WorkflowViewStub;
import com.squareup.workflow1.p685ui.backstack.BackStackContainer;
import fo.C13711h;
import io.sentry.C15134J0;
import io.sentry.C15153P1;
import io.sentry.C15157R0;
import io.sentry.EnumC15359h;
import io.sentry.InterfaceC15137K0;
import io.sentry.InterfaceC15145N;
import io.sentry.InterfaceC15320b0;
import io.sentry.clientreport.C15336d;
import io.sentry.clientreport.EnumC15337e;
import io.sentry.metrics.C15407b;
import io.sentry.protocol.C15447t;
import io.sentry.util.C15504i;
import io.sentry.util.InterfaceC15497b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AbstractC16544l;
import p046Bk.C1361Y;
import p1050v.InterfaceC20412a;
import p444S4.C7001g;
import p444S4.C7018x;
import p444S4.C7020z;
import p444S4.EnumC7019y;
import p523V9.AbstractC7841A0;
import p523V9.AbstractC7865D0;
import p547Wc.C8816z;
import p593Y8.C9682i;
import p644ab.InterfaceC10532e;
import p658b5.C11244o;
import p658b5.C11245p;
import p745f9.InterfaceC13587e;
import p758g0.InterfaceC13798z;
import p769gj.InterfaceC14150D;
import p791hj.C14520c;
import p791hj.ViewOnAttachStateChangeListenerC14519b;
import p797i1.InterfaceC14907i;
import p805i9.AbstractC14950a;
import p817j$.util.DesugarCollections;
import p817j$.util.concurrent.ConcurrentHashMap;
import p824j4.C16120p;
import p826j6.C16155i;
import p826j6.InterfaceC16165s;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: X.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8990d implements InterfaceC20412a, InterfaceC16165s, InterfaceC13587e, InterfaceC13798z, InterfaceC14150D, InterfaceC14907i, InterfaceC15137K0, InterfaceC15320b0, InterfaceC15497b, InterfaceC10532e {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f27435Y;

    public /* synthetic */ C8990d(int i10) {
        this.f27435Y = i10;
    }

    @Override // p758g0.InterfaceC13798z
    /* JADX INFO: renamed from: a */
    public float mo9579a(float f10) {
        return f10;
    }

    @Override // p1050v.InterfaceC20412a, p644ab.InterfaceC10532e
    /* JADX INFO: renamed from: apply */
    public Object mo22421apply(Object obj) {
        long jM8145a;
        int i10 = 0;
        switch (this.f27435Y) {
            case 3:
                List list = (List) obj;
                if (list == null) {
                    return null;
                }
                List<C11244o> list2 = list;
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
                for (C11244o c11244o : list2) {
                    ArrayList arrayList2 = c11244o.f34039q;
                    C7001g progress = !arrayList2.isEmpty() ? (C7001g) arrayList2.get(i10) : C7001g.f22407c;
                    UUID uuidFromString = UUID.fromString(c11244o.f34023a);
                    AbstractC16544l.m18093f(uuidFromString, "fromString(id)");
                    HashSet hashSet = new HashSet(c11244o.f34038p);
                    AbstractC16544l.m18093f(progress, "progress");
                    long j10 = c11244o.f34027e;
                    C7018x c7018x = j10 != 0 ? new C7018x(j10, c11244o.f34028f) : null;
                    EnumC7019y enumC7019y = EnumC7019y.f22432Y;
                    EnumC7019y enumC7019y2 = c11244o.f34024b;
                    int i11 = c11244o.f34030h;
                    long j11 = c11244o.f34026d;
                    if (enumC7019y2 == enumC7019y) {
                        C8990d c8990d = C11245p.f34040x;
                        jM8145a = AbstractC7865D0.m8145a(enumC7019y2 == enumC7019y && i11 > 0, i11, c11244o.f34031i, c11244o.f34032j, c11244o.f34033k, c11244o.f34034l, j10 != 0, j11, c11244o.f34028f, j10, c11244o.f34036n);
                    } else {
                        jM8145a = Long.MAX_VALUE;
                    }
                    long j12 = jM8145a;
                    arrayList.add(new C7020z(uuidFromString, enumC7019y2, hashSet, c11244o.f34025c, progress, i11, c11244o.f34035m, c11244o.f34029g, j11, c7018x, j12, c11244o.f34037o));
                    i10 = 0;
                }
                return arrayList;
            case 6:
                Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList3 = new ArrayList();
                    while (cursorRawQuery.moveToNext()) {
                        C13711h c13711hM10270a = C9682i.m10270a();
                        c13711hM10270a.m15184G(cursorRawQuery.getString(1));
                        c13711hM10270a.f43261p0 = AbstractC14950a.m16112b(cursorRawQuery.getInt(2));
                        String string = cursorRawQuery.getString(3);
                        c13711hM10270a.f43260o0 = string == null ? null : Base64.decode(string, 0);
                        arrayList3.add(c13711hM10270a.m15193g());
                        break;
                    }
                    return arrayList3;
                } finally {
                    cursorRawQuery.close();
                }
            default:
                return (C16120p) obj;
        }
    }

    @Override // p797i1.InterfaceC14907i
    /* JADX INFO: renamed from: b */
    public double mo9580b(double d10) {
        double d11;
        switch (this.f27435Y) {
            case 9:
                double dPow = d10 < 0.0d ? -d10 : d10;
                if (dPow >= 0.0031308049535603718d) {
                    dPow = Math.pow(dPow, 0.4166666666666667d) - 0.05213270142180095d;
                    d11 = 0.9478672985781991d;
                } else {
                    d11 = 0.07739938080495357d;
                }
                return Math.copySign(dPow / d11, d10);
            case 10:
                double d12 = d10 < 0.0d ? -d10 : d10;
                return Math.copySign(d12 >= 0.04045d ? Math.pow((0.9478672985781991d * d12) + 0.05213270142180095d, 2.4d) : d12 * 0.07739938080495357d, d10);
            default:
                return d10;
        }
    }

    @Override // p769gj.InterfaceC14150D
    /* JADX INFO: renamed from: c */
    public void mo3483c(View view, C8816z c8816z) {
        C14520c c14520c = C14520c.f45760Y;
        switch (this.f27435Y) {
            case 8:
                int i10 = WorkflowViewStub.f40523s0;
                AbstractC16544l.m18094g(view, "view");
                ViewOnAttachStateChangeListenerC14519b viewOnAttachStateChangeListenerC14519b = new ViewOnAttachStateChangeListenerC14519b(c14520c);
                AbstractC7841A0.m8092d(view, viewOnAttachStateChangeListenerC14519b);
                view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC14519b);
                c8816z.invoke();
                break;
            default:
                C1361Y c1361y = BackStackContainer.f40528q0;
                AbstractC16544l.m18094g(view, "view");
                ViewOnAttachStateChangeListenerC14519b viewOnAttachStateChangeListenerC14519b2 = new ViewOnAttachStateChangeListenerC14519b(c14520c);
                AbstractC7841A0.m8092d(view, viewOnAttachStateChangeListenerC14519b2);
                view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC14519b2);
                c8816z.invoke();
                break;
        }
    }

    @Override // io.sentry.InterfaceC15137K0
    /* JADX INFO: renamed from: f */
    public void mo390f(C15134J0 it) {
        switch (this.f27435Y) {
            case 14:
                it.getClass();
                it.f47114b = null;
                it.f47116d = null;
                it.f47115c = null;
                it.f47117e.clear();
                C15153P1 c15153p1 = it.f47118f;
                c15153p1.clear();
                Iterator<InterfaceC15145N> it2 = it.f47122j.getScopeObservers().iterator();
                while (it2.hasNext()) {
                    it2.next().mo16316g(c15153p1);
                }
                it.f47119g.clear();
                it.f47120h.clear();
                it.f47121i.clear();
                it.m16304a();
                it.f47128p.clear();
                break;
            case 20:
                AbstractC16544l.m18094g(it, "it");
                it.m16305b(C15447t.f48216Z);
                break;
            default:
                it.m16308e(new C15504i(it, 0));
                break;
        }
    }

    @Override // io.sentry.util.InterfaceC15497b
    /* JADX INFO: renamed from: g */
    public Object mo5056g() {
        switch (this.f27435Y) {
            case 16:
                return new C15157R0();
            case 17:
                return new C15407b();
            default:
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                for (EnumC15337e enumC15337e : EnumC15337e.values()) {
                    for (EnumC15359h enumC15359h : EnumC15359h.values()) {
                        concurrentHashMap.put(new C15336d(enumC15337e.getReason(), enumC15359h.getCategory()), new AtomicLong(0L));
                    }
                }
                return DesugarCollections.unmodifiableMap(concurrentHashMap);
        }
    }

    @Override // io.sentry.InterfaceC15320b0
    /* JADX INFO: renamed from: h */
    public Object mo392h() {
        return null;
    }

    @Override // p826j6.InterfaceC16165s
    public void onPurchasesUpdated(C16155i c16155i, List list) {
        AbstractC16544l.m18094g(c16155i, "<anonymous parameter 0>");
    }

    public /* synthetic */ C8990d(PreviewView previewView) {
        this.f27435Y = 0;
    }
}
