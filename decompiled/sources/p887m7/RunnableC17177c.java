package p887m7;

import bb.AbstractC11330w;
import java.io.IOException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import p087D7.AbstractC1976c;
import p1007s7.C19462a;
import p1007s7.InterfaceC19469h;
import p102Dm.AbstractC2119a;
import p1145z7.C21812i;
import p1145z7.InterfaceC21813j;
import p661b7.InterfaceC11256c;
import p676c7.C11682a;
import p780h7.InterfaceC14425g;
import p817j$.util.concurrent.ConcurrentHashMap;
import p849k7.InterfaceC16348a;
import p866l7.C16828a;
import p943p7.C18307e;
import p943p7.C18308f;
import p983r7.InterfaceC18886d;

/* JADX INFO: renamed from: m7.c */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC17177c implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final String f54868Y;

    /* JADX INFO: renamed from: Z */
    public final ScheduledThreadPoolExecutor f54869Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC19469h f54870o0;

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC17178d f54871p0;

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC16348a f54872q0;

    /* JADX INFO: renamed from: r0 */
    public final InterfaceC18886d f54873r0;

    /* JADX INFO: renamed from: s0 */
    public final InterfaceC21813j f54874s0;

    /* JADX INFO: renamed from: t0 */
    public final InterfaceC14425g f54875t0;

    /* JADX INFO: renamed from: u0 */
    public final int f54876u0;

    /* JADX INFO: renamed from: v0 */
    public final InterfaceC11256c f54877v0;

    public RunnableC17177c(int i10, InterfaceC11256c internalLogger, InterfaceC14425g interfaceC14425g, String featureName, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, InterfaceC16348a contextProvider, InterfaceC17178d dataUploader, InterfaceC18886d networkInfoProvider, InterfaceC19469h storage, InterfaceC21813j systemInfoProvider) {
        AbstractC16544l.m18094g(featureName, "featureName");
        AbstractC16544l.m18094g(storage, "storage");
        AbstractC16544l.m18094g(dataUploader, "dataUploader");
        AbstractC16544l.m18094g(contextProvider, "contextProvider");
        AbstractC16544l.m18094g(networkInfoProvider, "networkInfoProvider");
        AbstractC16544l.m18094g(systemInfoProvider, "systemInfoProvider");
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f54868Y = featureName;
        this.f54869Z = scheduledThreadPoolExecutor;
        this.f54870o0 = storage;
        this.f54871p0 = dataUploader;
        this.f54872q0 = contextProvider;
        this.f54873r0 = networkInfoProvider;
        this.f54874s0 = systemInfoProvider;
        this.f54875t0 = interfaceC14425g;
        this.f54876u0 = i10;
        this.f54877v0 = internalLogger;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC11330w abstractC11330wMo10840b;
        long jMin;
        Object objPutIfAbsent;
        int i10 = 0;
        if (this.f54873r0.mo17963o().f35439a != 1) {
            C21812i c21812iMo18884b = this.f54874s0.mo18884b();
            if ((c21812iMo18884b.f69180a || c21812iMo18884b.f69183d || c21812iMo18884b.f69181b > 10) && !c21812iMo18884b.f69182c) {
                C11682a context = this.f54872q0.getContext();
                int i11 = this.f54876u0;
                do {
                    i11--;
                    InterfaceC19469h interfaceC19469h = this.f54870o0;
                    C19462a c19462aMo18918g = interfaceC19469h.mo18918g();
                    if (c19462aMo18918g != null) {
                        abstractC11330wMo10840b = this.f54871p0.mo10840b(context, c19462aMo18918g.f61763b, c19462aMo18918g.f61764c);
                        interfaceC19469h.mo18916e(c19462aMo18918g.f61762a, abstractC11330wMo10840b instanceof C17190p ? C18308f.f58434b : new C18307e(abstractC11330wMo10840b.f34261b), !abstractC11330wMo10840b.f34262c);
                    } else {
                        abstractC11330wMo10840b = null;
                    }
                    if (abstractC11330wMo10840b != null) {
                        i10++;
                    }
                    if (i11 <= 0) {
                        break;
                    }
                } while (abstractC11330wMo10840b instanceof C17191q);
            } else {
                abstractC11330wMo10840b = null;
            }
        } else {
            abstractC11330wMo10840b = null;
        }
        Integer numValueOf = abstractC11330wMo10840b != null ? Integer.valueOf(abstractC11330wMo10840b.f34261b) : null;
        Throwable th2 = abstractC11330wMo10840b != null ? (Throwable) abstractC11330wMo10840b.f34260a : null;
        C17179e c17179e = (C17179e) this.f54875t0;
        String featureName = this.f54868Y;
        AbstractC16544l.m18094g(featureName, "featureName");
        ConcurrentHashMap concurrentHashMap = c17179e.f54880b;
        Object objValueOf = concurrentHashMap.get(featureName);
        C16828a c16828a = c17179e.f54879a;
        if (objValueOf == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(featureName, (objValueOf = Long.valueOf(c16828a.f54004e)))) != null) {
            objValueOf = objPutIfAbsent;
        }
        Long l4 = (Long) objValueOf;
        if (i10 <= 0 || th2 != null || numValueOf == null || numValueOf.intValue() != 202) {
            jMin = th2 instanceof IOException ? C17179e.f54878c : Math.min(c16828a.f54003d, AbstractC2119a.m3196j(l4.longValue() * 1.1d));
        } else {
            jMin = Math.max(c16828a.f54002c, AbstractC2119a.m3196j(l4.longValue() * 0.9d));
        }
        long j10 = jMin;
        concurrentHashMap.put(featureName, Long.valueOf(j10));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f54869Z;
        scheduledThreadPoolExecutor.remove(this);
        AbstractC1976c.m3151h(scheduledThreadPoolExecutor, featureName.concat(": data upload"), j10, TimeUnit.MILLISECONDS, this.f54877v0, this);
    }
}
