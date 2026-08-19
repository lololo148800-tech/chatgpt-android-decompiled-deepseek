package p273Kl;

import android.os.SystemClock;
import io.livekit.android.room.RegionInfo;
import io.livekit.android.room.RegionSettings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1160zp.AbstractC22225a;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p571X9.AbstractC9233X;
import p817j$.util.Objects;
import p867l8.C16831c;
import p909nm.AbstractC17680n;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.t0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4799t0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15653Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4801u0 f15654Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4799t0(C4801u0 c4801u0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15654Z = c4801u0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4799t0(this.f15654Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4799t0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        List list;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15653Y;
        C4801u0 c4801u0 = this.f15654Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            if (!AbstractC4764c.m5434a(c4801u0.f15658a)) {
                throw new IllegalStateException("Region availability is only supported for LiveKit Cloud domains");
            }
            if (c4801u0.f15662e == null || SystemClock.elapsedRealtime() - c4801u0.f15663f > 30000) {
                this.f15653Y = 1;
                if (c4801u0.m5436a(this) == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        RegionSettings regionSettings = c4801u0.f15662e;
        if (regionSettings == null || (list = regionSettings.f46937a) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            RegionInfo regionInfo = (RegionInfo) obj2;
            LinkedHashSet linkedHashSet = c4801u0.f15664g;
            if (!(linkedHashSet instanceof Collection) || !linkedHashSet.isEmpty()) {
                Iterator it = linkedHashSet.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!AbstractC16544l.m18089b(((RegionInfo) it.next()).f46934b, regionInfo.f46934b));
            }
            arrayList.add(obj2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        RegionInfo regionInfo2 = (RegionInfo) AbstractC17680n.m19341Q(arrayList);
        c4801u0.f15664g.add(regionInfo2);
        C8395g c8395g = AbstractC8396h.Companion;
        EnumC8397i enumC8397i = EnumC8397i.f26117Z;
        AbstractC8396h.Companion.getClass();
        if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
            Objects.toString(regionInfo2);
            AbstractC22225a.f70470a.getClass();
            C16831c.m18567d(new Object[0]);
        }
        return regionInfo2.f46934b;
    }
}
