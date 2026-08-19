package p519V4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.revenuecat.purchases.google.usecase.C12746a;
import com.revenuecat.purchases.google.usecase.C12748c;
import fo.C13711h;
import io.sentry.AbstractC15152P0;
import io.sentry.C15358g1;
import io.sentry.EnumC15147N1;
import io.sentry.InterfaceC15154Q;
import io.sentry.android.core.RunnableC15195M;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.AbstractC16544l;
import p1007s7.C19465d;
import p1072w2.C20793e;
import p1096x2.CallableC21110e;
import p110E4.C2315m;
import p265Kb.C4612e;
import p265Kb.C4613f;
import p414R.C6772f;
import p444S4.C6998d;
import p444S4.C7001g;
import p444S4.C7011q;
import p444S4.EnumC7019y;
import p470T4.C7241f;
import p470T4.C7246k;
import p470T4.C7253r;
import p501Ub.AbstractC7601c;
import p523V9.AbstractC7854B5;
import p523V9.AbstractC7881F0;
import p523V9.AbstractC7918J5;
import p523V9.AbstractC8135l5;
import p544W9.AbstractC8551S0;
import p544W9.AbstractC8561T4;
import p544W9.C8520M4;
import p544W9.C8549R4;
import p544W9.C8573V4;
import p544W9.C8675m4;
import p544W9.EnumC8668l3;
import p658b5.C11244o;
import p658b5.C11245p;
import p658b5.C11246q;
import p674c5.AbstractC11655h;
import p697d5.C13027j;
import p729ej.C13414e;
import p746fa.C13606o;
import p813ij.C15026j;
import p826j6.AbstractC16144M;
import p826j6.C16139H;
import p826j6.C16149c;
import p826j6.C16155i;
import p826j6.C16167u;
import p985r9.C18891a;
import p985r9.C18902l;
import p985r9.C18903m;
import p985r9.ExecutorC18898h;

/* JADX INFO: renamed from: V4.e */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7757e implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f24463Y;

    /* JADX INFO: renamed from: Z */
    public Object f24464Z;

    /* JADX INFO: renamed from: o0 */
    public Object f24465o0;

    /* JADX INFO: renamed from: p0 */
    public Object f24466p0;

    public /* synthetic */ RunnableC7757e() {
        this.f24463Y = 9;
    }

    /* JADX INFO: renamed from: a */
    private final void m8020a() {
        int i10;
        C13606o c13606oM20230o;
        C18891a c18891a = (C18891a) this.f24464Z;
        Intent intent = c18891a.f60227Y;
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("message_id");
        }
        if (TextUtils.isEmpty(stringExtra)) {
            c13606oM20230o = AbstractC7854B5.m8117e(null);
        } else {
            Bundle bundle = new Bundle();
            Intent intent2 = c18891a.f60227Y;
            String stringExtra2 = intent2.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent2.getStringExtra("message_id");
            }
            bundle.putString("google.message_id", stringExtra2);
            Intent intent3 = c18891a.f60227Y;
            Integer numValueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
            if (numValueOf != null) {
                bundle.putInt("google.product_id", numValueOf.intValue());
            }
            bundle.putBoolean("supports_message_handled", true);
            C18903m c18903mM20216n = C18903m.m20216n((Context) this.f24465o0);
            synchronized (c18903mM20216n) {
                i10 = c18903mM20216n.f60267a;
                c18903mM20216n.f60267a = i10 + 1;
            }
            c13606oM20230o = c18903mM20216n.m20230o(new C18902l(i10, 2, bundle, 0));
        }
        c13606oM20230o.m15123b(ExecutorC18898h.f60245Z, new C13414e((CountDownLatch) this.f24466p0));
    }

    /* JADX INFO: renamed from: b */
    public List m8021b() {
        C11246q c11246qMo12356t = ((C7253r) this.f24465o0).f22998c.mo12356t();
        c11246qMo12356t.getClass();
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.WorkSpecDao") : null;
        C2315m c2315mM3418a = C2315m.m3418a(1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        String str = (String) this.f24466p0;
        if (str == null) {
            c2315mM3418a.mo3426s0(1);
        } else {
            c2315mM3418a.mo3422c(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c11246qMo12356t.f34064a;
        workDatabase_Impl.m12339b();
        workDatabase_Impl.m12340c();
        try {
            Cursor cursorM8212b = AbstractC7918J5.m8212b(workDatabase_Impl, c2315mM3418a, true);
            try {
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                while (cursorM8212b.moveToNext()) {
                    String string = cursorM8212b.getString(0);
                    if (((ArrayList) map.get(string)) == null) {
                        map.put(string, new ArrayList());
                    }
                    String string2 = cursorM8212b.getString(0);
                    if (((ArrayList) map2.get(string2)) == null) {
                        map2.put(string2, new ArrayList());
                    }
                }
                cursorM8212b.moveToPosition(-1);
                c11246qMo12356t.m12632b(map);
                c11246qMo12356t.m12631a(map2);
                ArrayList arrayList = new ArrayList(cursorM8212b.getCount());
                while (cursorM8212b.moveToNext()) {
                    String string3 = cursorM8212b.isNull(0) ? null : cursorM8212b.getString(0);
                    EnumC7019y enumC7019yM8171j = AbstractC7881F0.m8171j(cursorM8212b.getInt(1));
                    C7001g c7001gM7401a = C7001g.m7401a(cursorM8212b.isNull(2) ? null : cursorM8212b.getBlob(2));
                    int i10 = cursorM8212b.getInt(3);
                    int i11 = cursorM8212b.getInt(4);
                    long j10 = cursorM8212b.getLong(13);
                    long j11 = cursorM8212b.getLong(14);
                    long j12 = cursorM8212b.getLong(15);
                    int iM8168g = AbstractC7881F0.m8168g(cursorM8212b.getInt(16));
                    long j13 = cursorM8212b.getLong(17);
                    long j14 = cursorM8212b.getLong(18);
                    int i12 = cursorM8212b.getInt(19);
                    long j15 = cursorM8212b.getLong(20);
                    int i13 = cursorM8212b.getInt(21);
                    C6998d c6998d = new C6998d(AbstractC7881F0.m8169h(cursorM8212b.getInt(5)), cursorM8212b.getInt(6) != 0, cursorM8212b.getInt(7) != 0, cursorM8212b.getInt(8) != 0, cursorM8212b.getInt(9) != 0, cursorM8212b.getLong(10), cursorM8212b.getLong(11), AbstractC7881F0.m8166e(cursorM8212b.isNull(12) ? null : cursorM8212b.getBlob(12)));
                    ArrayList arrayList2 = (ArrayList) map.get(cursorM8212b.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = arrayList2;
                    ArrayList arrayList4 = (ArrayList) map2.get(cursorM8212b.getString(0));
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList.add(new C11244o(string3, enumC7019yM8171j, c7001gM7401a, j10, j11, j12, c6998d, i10, iM8168g, j13, j14, i12, i11, j15, i13, arrayList3, arrayList4));
                }
                workDatabase_Impl.m12352o();
                if (interfaceC15154QMo16291v != null) {
                    interfaceC15154QMo16291v.mo16272c(EnumC15147N1.OK);
                }
                cursorM8212b.close();
                c2315mM3418a.m3425m();
                workDatabase_Impl.m12348k();
                if (interfaceC15154QMo16291v != null) {
                    interfaceC15154QMo16291v.mo16271b();
                }
                return (List) C11245p.f34040x.mo22421apply(arrayList);
            } catch (Throwable th2) {
                cursorM8212b.close();
                c2315mM3418a.m3425m();
                throw th2;
            }
        } catch (Throwable th3) {
            workDatabase_Impl.m12348k();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00bb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        String str;
        C8573V4 c8573v4;
        int i10 = 0;
        switch (this.f24463Y) {
            case 0:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f24466p0;
                Context context = (Context) this.f24465o0;
                Intent intent = (Intent) this.f24464Z;
                try {
                    boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    C7011q.m7408d().m7410a(ConstraintProxyUpdateReceiver.f33720a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                    AbstractC11655h.m13018a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    AbstractC11655h.m13018a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    AbstractC11655h.m13018a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    AbstractC11655h.m13018a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 1:
                C8520M4 c8520m4 = (C8520M4) this.f24464Z;
                C15358g1 c15358g1 = (C15358g1) this.f24465o0;
                EnumC8668l3 enumC8668l3 = EnumC8668l3.INPUT_IMAGE_CONSTRUCTION;
                String str2 = (String) this.f24466p0;
                C13711h c13711h = (C13711h) c15358g1.f47945Y;
                c13711h.f43260o0 = enumC8668l3;
                C8675m4 c8675m4 = (C8675m4) c13711h.f43259Z;
                if (c8675m4 != null) {
                    int i11 = AbstractC8551S0.f26380a;
                    str = c8675m4.f26614d;
                    if (str == null || str.isEmpty()) {
                        str = "NA";
                    }
                } else {
                    str = "NA";
                }
                C19465d c19465d = new C19465d();
                c19465d.f61768Y = c8520m4.f26339a;
                c19465d.f61769Z = c8520m4.f26340b;
                synchronized (C8520M4.class) {
                    c8573v4 = C8520M4.f26337j;
                    if (c8573v4 == null) {
                        C20793e c20793eM8657e = AbstractC8135l5.m8657e(Resources.getSystem().getConfiguration());
                        Object[] objArrCopyOf = new Object[4];
                        int i12 = 0;
                        while (i10 < c20793eM8657e.f66056a.size()) {
                            Locale locale = c20793eM8657e.f66056a.get(i10);
                            C15026j c15026j = AbstractC7601c.f24035a;
                            String languageTag = locale.toLanguageTag();
                            languageTag.getClass();
                            int i13 = i12 + 1;
                            int length = objArrCopyOf.length;
                            if (length < i13) {
                                int i14 = length + (length >> 1) + 1;
                                if (i14 < i13) {
                                    int iHighestOneBit = Integer.highestOneBit(i12);
                                    i14 = iHighestOneBit + iHighestOneBit;
                                }
                                if (i14 < 0) {
                                    i14 = Integer.MAX_VALUE;
                                }
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i14);
                            }
                            objArrCopyOf[i12] = languageTag;
                            i10++;
                            i12 = i13;
                        }
                        C8549R4 c8549r4 = AbstractC8561T4.f26389Z;
                        c8573v4 = i12 == 0 ? C8573V4.f26397q0 : new C8573V4(i12, objArrCopyOf);
                        C8520M4.f26337j = c8573v4;
                    }
                }
                c19465d.f61772q0 = c8573v4;
                c19465d.f61775t0 = Boolean.TRUE;
                c19465d.f61771p0 = str;
                c19465d.f61770o0 = str2;
                c19465d.f61773r0 = c8520m4.f26344f.m15132k() ? (String) c8520m4.f26344f.m15130i() : c8520m4.f26342d.m7956a();
                c19465d.f61777v0 = 10;
                c19465d.f61778w0 = Integer.valueOf(c8520m4.f26346h);
                c15358g1.f47946Z = c19465d;
                c8520m4.f26341c.mo9170a(c15358g1);
                return;
            case 2:
                ((C7241f) this.f24464Z).m7649j((C7246k) this.f24465o0, (C15358g1) this.f24466p0);
                return;
            case 3:
                C13027j c13027j = (C13027j) this.f24464Z;
                try {
                    c13027j.m14769k(m8021b());
                    return;
                } catch (Throwable th2) {
                    c13027j.m14770l(th2);
                    return;
                }
            case 4:
                C16149c c16149c = (C16149c) this.f24464Z;
                c16149c.getClass();
                C16155i c16155i = AbstractC16144M.f50089l;
                c16149c.m17756D(24, 4, c16155i);
                ((C12746a) this.f24465o0).m14489d(c16155i, ((C4613f) this.f24466p0).f15035Y);
                return;
            case 5:
                ((C16139H) this.f24464Z).m17704K((C16167u) this.f24465o0, (C12748c) this.f24466p0);
                return;
            case 6:
                ((C16139H) this.f24464Z).m17703J((C4613f) this.f24465o0, (C12746a) this.f24466p0);
                return;
            case 7:
                ((C16139H) this.f24464Z).m17702I((C4612e) this.f24465o0, (C12746a) this.f24466p0);
                return;
            case 8:
                m8020a();
                return;
            default:
                try {
                    objCall = ((CallableC21110e) this.f24464Z).call();
                    break;
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.f24466p0).post(new RunnableC15195M((C6772f) this.f24465o0, objCall, null == true ? 1 : 0, 22));
                return;
        }
    }

    public /* synthetic */ RunnableC7757e(C8520M4 c8520m4, C15358g1 c15358g1, String str) {
        this.f24463Y = 1;
        this.f24464Z = c8520m4;
        this.f24465o0 = c15358g1;
        this.f24466p0 = str;
    }

    public /* synthetic */ RunnableC7757e(Context context, C18891a c18891a, CountDownLatch countDownLatch) {
        this.f24463Y = 8;
        this.f24465o0 = context;
        this.f24464Z = c18891a;
        this.f24466p0 = countDownLatch;
    }

    public /* synthetic */ RunnableC7757e(Object obj, Object obj2, Object obj3, int i10) {
        this.f24463Y = i10;
        this.f24464Z = obj;
        this.f24465o0 = obj2;
        this.f24466p0 = obj3;
    }

    public RunnableC7757e(C7241f processor, C7246k c7246k, C15358g1 c15358g1) {
        this.f24463Y = 2;
        AbstractC16544l.m18094g(processor, "processor");
        this.f24464Z = processor;
        this.f24465o0 = c7246k;
        this.f24466p0 = c15358g1;
    }

    public RunnableC7757e(C7253r c7253r, String str) {
        this.f24463Y = 3;
        this.f24465o0 = c7253r;
        this.f24466p0 = str;
        this.f24464Z = new C13027j();
    }
}
