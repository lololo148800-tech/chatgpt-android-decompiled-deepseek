package p722e8;

import com.datadog.android.rum.DdRumContentProvider;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC8119j5;
import p604Yk.C10077b;
import p661b7.EnumC11255b;
import p677c8.C11689a;
import p677c8.C11691c;
import p714e0.C13254b;
import p743f7.InterfaceC13575a;
import p765g7.InterfaceC13823a;
import p902n8.InterfaceC17524k;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: e8.g */
/* JADX INFO: loaded from: classes.dex */
public final class C13323g implements InterfaceC13303M {

    /* JADX INFO: renamed from: a */
    public final InterfaceC13823a f42259a;

    /* JADX INFO: renamed from: b */
    public final float f42260b;

    /* JADX INFO: renamed from: c */
    public final boolean f42261c;

    /* JADX INFO: renamed from: d */
    public final boolean f42262d;

    /* JADX INFO: renamed from: e */
    public final C13254b f42263e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC17524k f42264f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC17524k f42265g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC17524k f42266h;

    /* JADX INFO: renamed from: i */
    public final C15384c f42267i;

    /* JADX INFO: renamed from: j */
    public final C10077b f42268j;

    /* JADX INFO: renamed from: k */
    public C11689a f42269k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f42270l;

    /* JADX INFO: renamed from: m */
    public C13306P f42271m;

    /* JADX INFO: renamed from: n */
    public boolean f42272n;

    public C13323g(InterfaceC13823a interfaceC13823a, float f10, boolean z6, boolean z10, C13254b firstPartyHostHeaderTypeResolver, InterfaceC17524k cpuVitalMonitor, InterfaceC17524k memoryVitalMonitor, InterfaceC17524k frameRateVitalMonitor, C15384c c15384c, C10077b c10077b) {
        AbstractC16544l.m18094g(firstPartyHostHeaderTypeResolver, "firstPartyHostHeaderTypeResolver");
        AbstractC16544l.m18094g(cpuVitalMonitor, "cpuVitalMonitor");
        AbstractC16544l.m18094g(memoryVitalMonitor, "memoryVitalMonitor");
        AbstractC16544l.m18094g(frameRateVitalMonitor, "frameRateVitalMonitor");
        this.f42259a = interfaceC13823a;
        this.f42260b = f10;
        this.f42261c = z6;
        this.f42262d = z10;
        this.f42263e = firstPartyHostHeaderTypeResolver;
        this.f42264f = cpuVitalMonitor;
        this.f42265g = memoryVitalMonitor;
        this.f42266h = frameRateVitalMonitor;
        this.f42267i = c15384c;
        this.f42268j = c10077b;
        this.f42269k = new C11689a("c9880c8d-14b8-4540-aefd-e4a07e9216b4", C11689a.f35456p, false, null, null, null, null, 1, 1, 1, null, null, 0L, 0L, false);
        this.f42270l = AbstractC17681o.m19384m(new C13305O(this, interfaceC13823a, c15384c, f10, z6, z10, this, firstPartyHostHeaderTypeResolver, cpuVitalMonitor, memoryVitalMonitor, frameRateVitalMonitor, c10077b, false));
    }

    @Override // p722e8.InterfaceC13303M
    /* JADX INFO: renamed from: a */
    public final boolean mo14926a() {
        return true;
    }

    @Override // p722e8.InterfaceC13303M
    /* JADX INFO: renamed from: b */
    public final InterfaceC13303M mo14927b(AbstractC8119j5 event, InterfaceC13575a writer) {
        Object next;
        InterfaceC13823a interfaceC13823a;
        ArrayList arrayList;
        InterfaceC13575a interfaceC13575a;
        boolean z6;
        C13306P c13306p;
        AbstractC16544l.m18094g(event, "event");
        AbstractC16544l.m18094g(writer, "writer");
        if (event instanceof C13340x) {
            C13340x c13340x = (C13340x) event;
            this.f42269k = C11689a.m13025a(this.f42269k, null, false, null, null, null, null, 0, 0, 0, c13340x.f42315b, c13340x.f42316c, 0L, 0L, 29695);
        }
        boolean z10 = event instanceof C13291A;
        boolean z11 = z10 || (event instanceof C13341y);
        ArrayList arrayList2 = this.f42270l;
        Iterator it = arrayList2.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((InterfaceC13303M) next).mo14926a());
        InterfaceC13303M interfaceC13303M = (InterfaceC13303M) next;
        InterfaceC13823a interfaceC13823a2 = this.f42259a;
        if (interfaceC13303M == null && z11) {
            interfaceC13823a = interfaceC13823a2;
            interfaceC13575a = writer;
            C13305O c13305o = new C13305O(this, interfaceC13823a2, this.f42267i, this.f42260b, this.f42261c, this.f42262d, this, this.f42263e, this.f42264f, this.f42265g, this.f42266h, this.f42268j, true);
            arrayList = arrayList2;
            arrayList.add(c13305o);
            if (!z10 && (c13306p = this.f42271m) != null) {
                c13305o.mo14927b(new C13291A(c13306p.f42099a, c13306p.f42100b, new C11691c()), interfaceC13575a);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList) {
                if (((InterfaceC13303M) obj).mo14926a()) {
                    arrayList3.add(obj);
                }
            }
            z6 = true;
            if (arrayList3.size() > 1) {
                AbstractC7889G0.m8184b(interfaceC13823a.mo15463s(), 5, EnumC11255b.f34100o0, C13322f.f42251Z, null, false, 56);
            }
        } else {
            interfaceC13823a = interfaceC13823a2;
            arrayList = arrayList2;
            interfaceC13575a = writer;
            z6 = true;
        }
        InterfaceC13575a interfaceC13575a2 = interfaceC13575a;
        if (!(event instanceof C13338v) && !this.f42272n) {
            C11691c c11691cMo8622a = event.mo8622a();
            if (DdRumContentProvider.f35997Y == 100) {
                long jMo15453i = interfaceC13823a.mo15453i();
                long nanos = TimeUnit.MILLISECONDS.toNanos(c11691cMo8622a.f35476a);
                long j10 = c11691cMo8622a.f35477b;
                C13329m c13329m = new C13329m(new C11691c(TimeUnit.NANOSECONDS.toMillis((nanos - j10) + jMo15453i), jMo15453i), j10 - jMo15453i);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((InterfaceC13303M) it2.next()).mo14927b(c13329m, interfaceC13575a2) == null) {
                        it2.remove();
                    }
                }
                this.f42272n = z6;
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            if (((InterfaceC13303M) it3.next()).mo14927b(event, interfaceC13575a2) == null) {
                it3.remove();
            }
        }
        return this;
    }
}
