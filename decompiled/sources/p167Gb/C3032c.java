package p167Gb;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Parcel;
import android.view.View;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.recyclerview.widget.RecyclerView;
import cn.UfGr.EhBykzn;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.sentry.android.core.AbstractC15256t;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.GNuz.HJrCuD;
import livekit.org.webrtc.WebrtcBuildVersion;
import mm.C17312o;
import p000.AbstractC17714o;
import p003A1.AbstractC0168G;
import p011A9.BinderC0416g;
import p011A9.C0410a;
import p011A9.C0414e;
import p011A9.C0418i;
import p025An.C0624m;
import p035B7.C0846c;
import p049Bm.InterfaceC1436k;
import p079D.AbstractC1762b;
import p1007s7.InterfaceC19466e;
import p1016t3.AbstractC19754D;
import p1016t3.C19788o;
import p1022t9.AbstractC19821f;
import p1036u9.InterfaceC20165k;
import p1073w3.AbstractC20817s;
import p1078w9.AbstractC20851a;
import p110E4.C2313k;
import p117Eb.C2385o;
import p158G3.InterfaceC2984c;
import p159G4.C2990a;
import p159G4.C2991b;
import p159G4.C2993d;
import p159G4.C2994e;
import p178H.C3124Q;
import p178H.InterfaceC3121N;
import p178H.InterfaceC3127U;
import p214Ib.C3674q;
import p214Ib.C3677t;
import p228J.C3847l0;
import p233J4.C4256b;
import p257K3.InterfaceC4536d;
import p265Kb.InterfaceC4623p;
import p283L5.AbstractC4941g;
import p301M.C5222d;
import p301M.InterfaceC5221c;
import p333N9.AbstractC5688i;
import p333N9.BinderC5681b;
import p333N9.C5691l;
import p333N9.C5692m;
import p357Oa.InterfaceC6150c;
import p377P9.AbstractC6375a;
import p425Ra.C6836i;
import p425Ra.C6840m;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC8160o6;
import p544W9.AbstractC8595Z2;
import p571X9.AbstractC9141H2;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9393x3;
import p572Xa.C9418l;
import p572Xa.InterfaceC9419m;
import p610Z1.C10142i;
import p610Z1.InterfaceC10143j;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p720e6.C13288c;
import p746fa.C13599h;
import p746fa.InterfaceC13593b;
import p746fa.InterfaceC13595d;
import p746fa.InterfaceC13596e;
import p758g0.C13729E;
import p758g0.InterfaceC13727C;
import p758g0.InterfaceC13786s;
import p817j$.util.DesugarCollections;
import p826j6.C16137F;
import p841k.C16288h;
import p885m4.C17155e;
import p903n9.C17534h;
import p909nm.AbstractC17681o;
import p960q9.C18655i;

/* JADX INFO: renamed from: Gb.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3032c implements InterfaceC20165k, InterfaceC3121N, InterfaceC2984c, InterfaceC5221c, InterfaceC4536d, InterfaceC4623p, InterfaceC10143j, InterfaceC6150c, InterfaceC9419m, InterfaceC19466e, InterfaceC13595d, InterfaceC13596e, InterfaceC13593b, InterfaceC13786s {

    /* JADX INFO: renamed from: o0 */
    public static volatile C3032c f9125o0;

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9126Y;

    /* JADX INFO: renamed from: Z */
    public Object f9127Z;

    public /* synthetic */ C3032c(int i10, boolean z6) {
        this.f9126Y = i10;
    }

    /* JADX INFO: renamed from: h */
    public static void m3909h(C4256b c4256b) {
        c4256b.m5018E("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c4256b.m5018E("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        c4256b.m5018E("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        c4256b.m5018E("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        c4256b.m5018E("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        c4256b.m5018E("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        c4256b.m5018E("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c4256b.m5018E("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        c4256b.m5018E("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c4256b.m5018E("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c4256b.m5018E("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        c4256b.m5018E("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c4256b.m5018E("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        c4256b.m5018E("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c4256b.m5018E("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
    }

    /* JADX INFO: renamed from: k */
    public static String m3910k(int i10, int i11, String str) {
        return i10 + '-' + i11 + '-' + str;
    }

    @Override // p301M.InterfaceC5221c
    /* JADX INFO: renamed from: J */
    public void mo3912J(Throwable th2) throws Exception {
        ((InterfaceC3127U) this.f9127Z).close();
    }

    @Override // p1007s7.InterfaceC19466e
    /* JADX INFO: renamed from: N */
    public Object mo3913N(Object obj) {
        String model = (String) obj;
        EnumC11255b enumC11255b = EnumC11255b.f34100o0;
        EnumC11255b enumC11255b2 = EnumC11255b.f34099Z;
        AbstractC16544l.m18094g(model, "model");
        try {
            return AbstractC9393x3.m9973c(model);
        } catch (C3677t e10) {
            AbstractC7889G0.m8185c((InterfaceC11256c) this.f9127Z, 5, AbstractC17681o.m19382k(enumC11255b2, enumC11255b), new C0846c(model, 6), e10, 48);
            return null;
        } catch (IllegalStateException e11) {
            AbstractC7889G0.m8185c((InterfaceC11256c) this.f9127Z, 5, AbstractC17681o.m19382k(enumC11255b2, enumC11255b), new C0846c(model, 7), e11, 48);
            return null;
        }
    }

    @Override // p265Kb.InterfaceC4623p
    /* JADX INFO: renamed from: R */
    public Object mo3263R() {
        Type type = (Type) this.f9127Z;
        if (!(type instanceof ParameterizedType)) {
            throw new C3674q("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new C3674q("Invalid EnumSet type: " + type.toString());
    }

    @Override // p357Oa.InterfaceC6150c
    /* JADX INFO: renamed from: a */
    public Object mo3914a() {
        return (Context) ((C18655i) this.f9127Z).f59414Z;
    }

    @Override // p1036u9.InterfaceC20165k
    public void accept(Object obj, Object obj2) {
        switch (this.f9126Y) {
            case 2:
                BinderC0416g binderC0416g = new BinderC0416g((C13599h) obj2, 0);
                C0414e c0414e = (C0414e) ((C0418i) obj).m13209q();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(c0414e.f18446c);
                AbstractC6375a.m6990d(parcelObtain, binderC0416g);
                AbstractC6375a.m6989c(parcelObtain, (C0410a) this.f9127Z);
                c0414e.m6112d(parcelObtain, 1);
                break;
            default:
                BinderC5681b binderC5681b = new BinderC5681b((C13599h) obj2, 0);
                C5692m c5692m = (C5692m) ((C5691l) obj).m13209q();
                C17534h c17534h = (C17534h) this.f9127Z;
                Parcel parcelM6113i = c5692m.m6113i();
                int i10 = AbstractC5688i.f18460a;
                parcelM6113i.writeStrongBinder(binderC5681b);
                AbstractC5688i.m6133c(parcelM6113i, c17534h);
                c5692m.m6114k(parcelM6113i, 2);
                break;
        }
    }

    @Override // p610Z1.InterfaceC10143j
    /* JADX INFO: renamed from: b */
    public Object mo169b(C10142i c10142i) {
        C5222d c5222d = (C5222d) this.f9127Z;
        AbstractC4941g.m5559R("The result can only set once!", c5222d.f16960Z == null);
        c5222d.f16960Z = c10142i;
        return "FutureChain[" + c5222d + "]";
    }

    @Override // p178H.InterfaceC3121N
    /* JADX INFO: renamed from: c */
    public void mo3915c(C3124Q c3124q) {
        AbstractC8160o6.m8727b(AbstractC17714o.f56552b, "Failed to capture image " + c3124q.getMessage(), null, 6);
    }

    @Override // p572Xa.InterfaceC9420n
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ Object mo3447d() {
        return new C6840m((C6836i) ((C9418l) this.f9127Z).mo3447d());
    }

    @Override // p746fa.InterfaceC13593b
    /* JADX INFO: renamed from: e */
    public void mo3916e() {
        ((CountDownLatch) this.f9127Z).countDown();
    }

    @Override // p178H.InterfaceC3121N
    /* JADX INFO: renamed from: f */
    public void mo3917f(C13288c outputFileResults) {
        AbstractC16544l.m18094g(outputFileResults, "outputFileResults");
        Uri uri = (Uri) outputFileResults.f42001Y;
        if (uri != null) {
            ((InterfaceC1436k) this.f9127Z).invoke(uri);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m3918g(Context context, int i10, int i11) {
        int iM17687j;
        Resources resources = context.getResources();
        AbstractC16544l.m18093f(resources, "context.resources");
        String strM9256a = AbstractC8595Z2.m9256a(resources, i10);
        Resources resources2 = context.getResources();
        AbstractC16544l.m18093f(resources2, "context.resources");
        String strM9256a2 = AbstractC8595Z2.m9256a(resources2, i11);
        C16137F c16137f = (C16137F) this.f9127Z;
        c16137f.getClass();
        if (c16137f.f50063Z != 0) {
            c16137f.m17697r();
        }
        int iM17687j2 = C16137F.m17687j(35633, strM9256a);
        if (iM17687j2 != 0 && (iM17687j = C16137F.m17687j(35632, strM9256a2)) != 0) {
            int iGlCreateProgram = GLES20.glCreateProgram();
            c16137f.f50063Z = iGlCreateProgram;
            if (iGlCreateProgram == 0) {
                return;
            }
            GLES20.glAttachShader(iGlCreateProgram, iM17687j2);
            C16137F.m17686c("glAttachShader: vertex");
            GLES20.glAttachShader(c16137f.f50063Z, iM17687j);
            C16137F.m17686c("glAttachShader: pixel");
            int i12 = c16137f.f50063Z;
            if (i12 != 0) {
                GLES20.glLinkProgram(i12);
                int[] iArr = new int[1];
                GLES20.glGetProgramiv(c16137f.f50063Z, 35714, iArr, 0);
                if (iArr[0] == 1) {
                    return;
                }
                if (AbstractC9141H2.f27918a) {
                    AbstractC15256t.m16465c("GLShader", "Could not link program: ");
                }
                String strGlGetProgramInfoLog = GLES20.glGetProgramInfoLog(c16137f.f50063Z);
                AbstractC16544l.m18093f(strGlGetProgramInfoLog, "glGetProgramInfoLog(program)");
                if (AbstractC9141H2.f27918a) {
                    AbstractC15256t.m16465c("GLShader", strGlGetProgramInfoLog);
                }
                GLES20.glDeleteProgram(c16137f.f50063Z);
                c16137f.f50063Z = 0;
            }
        }
        if (AbstractC9141H2.f27918a) {
            AbstractC15256t.m16465c("GLShader", "shader program wasn't created");
        }
    }

    @Override // p758g0.InterfaceC13786s
    public InterfaceC13727C get(int i10) {
        return (C13729E) this.f9127Z;
    }

    /* JADX INFO: renamed from: i */
    public int m3919i(String key) {
        AbstractC16544l.m18094g(key, "key");
        return ((SharedPreferences) this.f9127Z).getInt(key, 0);
    }

    /* JADX INFO: renamed from: j */
    public Set m3920j() {
        Set setUnmodifiableSet;
        synchronized (((HashSet) this.f9127Z)) {
            setUnmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.f9127Z);
        }
        return setUnmodifiableSet;
    }

    /* JADX INFO: renamed from: m */
    public void m3921m(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.f9127Z;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            RecyclerView.m12244L(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
    
        if (r2 >= 26) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0078, code lost:
    
        if (r2 >= 34) goto L45;
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int m3922n(C19788o c19788o) {
        String str = c19788o.f62752m;
        if (str == null || !AbstractC19754D.m20708f(str)) {
            return AbstractC0168G.m522k(0, 0, 0, 0);
        }
        int i10 = AbstractC20817s.f66106a;
        String str2 = c19788o.f62752m;
        str2.getClass();
        int i11 = AbstractC20817s.f66106a;
        switch (str2) {
            case "image/avif":
                break;
            case "image/heic":
            case "image/heif":
                break;
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                break;
            default:
                return AbstractC0168G.m522k(1, 0, 0, 0);
        }
        return AbstractC0168G.m522k(4, 0, 0, 0);
    }

    @Override // p746fa.InterfaceC13595d
    public void onFailure(Exception exc) {
        switch (this.f9126Y) {
            case 24:
                ((C0624m) this.f9127Z).resumeWith(new C17312o(AbstractC9233X.m9806b(exc)));
                break;
            default:
                ((CountDownLatch) this.f9127Z).countDown();
                break;
        }
    }

    @Override // p301M.InterfaceC5221c, p746fa.InterfaceC13596e
    public void onSuccess(Object obj) {
        switch (this.f9126Y) {
            case 9:
                break;
            default:
                ((CountDownLatch) this.f9127Z).countDown();
                break;
        }
    }

    public /* synthetic */ C3032c(Object obj, int i10) {
        this.f9126Y = i10;
        this.f9127Z = obj;
    }

    /* JADX INFO: renamed from: l */
    public static C2313k m3911l(C4256b c4256b) {
        HashMap map = new HashMap(2);
        map.put("work_spec_id", new C2990a(1, 1, "work_spec_id", "TEXT", null, true));
        map.put("prerequisite_id", new C2990a(2, 1, "prerequisite_id", "TEXT", null, true));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new C2991b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(ParameterNames.f31999ID)));
        hashSet.add(new C2991b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList(ParameterNames.f31999ID)));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new C2993d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        hashSet2.add(new C2993d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
        C2994e c2994e = new C2994e("Dependency", map, hashSet, hashSet2);
        C2994e c2994eM3827a = C2994e.m3827a(c4256b, "Dependency");
        if (!c2994e.equals(c2994eM3827a)) {
            return new C2313k(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + c2994e + "\n Found:\n" + c2994eM3827a, 0);
        }
        HashMap map2 = new HashMap(30);
        map2.put(ParameterNames.f31999ID, new C2990a(1, 1, ParameterNames.f31999ID, "TEXT", null, true));
        map2.put("state", new C2990a(0, 1, "state", "INTEGER", null, true));
        map2.put("worker_class_name", new C2990a(0, 1, "worker_class_name", "TEXT", null, true));
        map2.put("input_merger_class_name", new C2990a(0, 1, EhBykzn.DVa, "TEXT", null, true));
        map2.put("input", new C2990a(0, 1, "input", "BLOB", null, true));
        map2.put("output", new C2990a(0, 1, "output", "BLOB", null, true));
        map2.put("initial_delay", new C2990a(0, 1, "initial_delay", "INTEGER", null, true));
        map2.put("interval_duration", new C2990a(0, 1, "interval_duration", "INTEGER", null, true));
        map2.put("flex_duration", new C2990a(0, 1, "flex_duration", "INTEGER", null, true));
        map2.put("run_attempt_count", new C2990a(0, 1, "run_attempt_count", "INTEGER", null, true));
        map2.put("backoff_policy", new C2990a(0, 1, "backoff_policy", "INTEGER", null, true));
        map2.put("backoff_delay_duration", new C2990a(0, 1, "backoff_delay_duration", "INTEGER", null, true));
        map2.put("last_enqueue_time", new C2990a(0, 1, "last_enqueue_time", "INTEGER", "-1", true));
        map2.put("minimum_retention_duration", new C2990a(0, 1, "minimum_retention_duration", "INTEGER", null, true));
        map2.put("schedule_requested_at", new C2990a(0, 1, "schedule_requested_at", "INTEGER", null, true));
        map2.put("run_in_foreground", new C2990a(0, 1, "run_in_foreground", "INTEGER", null, true));
        map2.put("out_of_quota_policy", new C2990a(0, 1, "out_of_quota_policy", "INTEGER", null, true));
        map2.put("period_count", new C2990a(0, 1, "period_count", "INTEGER", WebrtcBuildVersion.maint_version, true));
        map2.put("generation", new C2990a(0, 1, "generation", "INTEGER", WebrtcBuildVersion.maint_version, true));
        map2.put("next_schedule_time_override", new C2990a(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
        map2.put("next_schedule_time_override_generation", new C2990a(0, 1, "next_schedule_time_override_generation", "INTEGER", WebrtcBuildVersion.maint_version, true));
        map2.put("stop_reason", new C2990a(0, 1, "stop_reason", "INTEGER", "-256", true));
        map2.put("required_network_type", new C2990a(0, 1, "required_network_type", "INTEGER", null, true));
        map2.put("requires_charging", new C2990a(0, 1, "requires_charging", "INTEGER", null, true));
        map2.put("requires_device_idle", new C2990a(0, 1, "requires_device_idle", "INTEGER", null, true));
        map2.put("requires_battery_not_low", new C2990a(0, 1, "requires_battery_not_low", "INTEGER", null, true));
        map2.put("requires_storage_not_low", new C2990a(0, 1, "requires_storage_not_low", "INTEGER", null, true));
        map2.put("trigger_content_update_delay", new C2990a(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
        map2.put("trigger_max_content_delay", new C2990a(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
        map2.put("content_uri_triggers", new C2990a(0, 1, "content_uri_triggers", "BLOB", null, true));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new C2993d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
        hashSet4.add(new C2993d("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
        C2994e c2994e2 = new C2994e("WorkSpec", map2, hashSet3, hashSet4);
        C2994e c2994eM3827a2 = C2994e.m3827a(c4256b, "WorkSpec");
        if (!c2994e2.equals(c2994eM3827a2)) {
            return new C2313k(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + c2994e2 + "\n Found:\n" + c2994eM3827a2, 0);
        }
        HashMap map3 = new HashMap(2);
        map3.put(ParameterNames.TAG, new C2990a(1, 1, ParameterNames.TAG, "TEXT", null, true));
        map3.put("work_spec_id", new C2990a(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new C2991b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(ParameterNames.f31999ID)));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new C2993d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        C2994e c2994e3 = new C2994e("WorkTag", map3, hashSet5, hashSet6);
        C2994e c2994eM3827a3 = C2994e.m3827a(c4256b, "WorkTag");
        if (!c2994e3.equals(c2994eM3827a3)) {
            return new C2313k(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + c2994e3 + "\n Found:\n" + c2994eM3827a3, 0);
        }
        HashMap map4 = new HashMap(3);
        map4.put("work_spec_id", new C2990a(1, 1, "work_spec_id", "TEXT", null, true));
        map4.put("generation", new C2990a(2, 1, "generation", "INTEGER", WebrtcBuildVersion.maint_version, true));
        map4.put("system_id", new C2990a(0, 1, "system_id", "INTEGER", null, true));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new C2991b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(ParameterNames.f31999ID)));
        C2994e c2994e4 = new C2994e("SystemIdInfo", map4, hashSet7, new HashSet(0));
        C2994e c2994eM3827a4 = C2994e.m3827a(c4256b, "SystemIdInfo");
        if (!c2994e4.equals(c2994eM3827a4)) {
            return new C2313k(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + c2994e4 + "\n Found:\n" + c2994eM3827a4, 0);
        }
        HashMap map5 = new HashMap(2);
        map5.put(DiagnosticsEntry.NAME_KEY, new C2990a(1, 1, DiagnosticsEntry.NAME_KEY, "TEXT", null, true));
        map5.put("work_spec_id", new C2990a(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new C2991b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(ParameterNames.f31999ID)));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new C2993d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        C2994e c2994e5 = new C2994e("WorkName", map5, hashSet8, hashSet9);
        C2994e c2994eM3827a5 = C2994e.m3827a(c4256b, "WorkName");
        if (!c2994e5.equals(c2994eM3827a5)) {
            return new C2313k(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + c2994e5 + "\n Found:\n" + c2994eM3827a5, 0);
        }
        HashMap map6 = new HashMap(2);
        map6.put("work_spec_id", new C2990a(1, 1, "work_spec_id", "TEXT", null, true));
        map6.put("progress", new C2990a(0, 1, "progress", "BLOB", null, true));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new C2991b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(ParameterNames.f31999ID)));
        HashSet hashSet11 = new HashSet(0);
        String str = HJrCuD.DmVscgaEARrK;
        C2994e c2994e6 = new C2994e(str, map6, hashSet10, hashSet11);
        C2994e c2994eM3827a6 = C2994e.m3827a(c4256b, str);
        if (!c2994e6.equals(c2994eM3827a6)) {
            return new C2313k(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + c2994e6 + "\n Found:\n" + c2994eM3827a6, 0);
        }
        HashMap map7 = new HashMap(2);
        map7.put(SubscriberAttributeKt.JSON_NAME_KEY, new C2990a(1, 1, SubscriberAttributeKt.JSON_NAME_KEY, "TEXT", null, true));
        map7.put("long_value", new C2990a(0, 1, "long_value", "INTEGER", null, false));
        C2994e c2994e7 = new C2994e("Preference", map7, new HashSet(0), new HashSet(0));
        C2994e c2994eM3827a7 = C2994e.m3827a(c4256b, "Preference");
        if (c2994e7.equals(c2994eM3827a7)) {
            return new C2313k(true, (String) null, 0);
        }
        return new C2313k(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + c2994e7 + "\n Found:\n" + c2994eM3827a7, 0);
    }

    public /* synthetic */ C3032c(AbstractC19821f abstractC19821f, AbstractC20851a abstractC20851a, int i10) {
        this.f9126Y = i10;
        this.f9127Z = abstractC20851a;
    }

    public C3032c(C16288h resolvableApiLauncher) {
        this.f9126Y = 18;
        AbstractC16544l.m18094g(resolvableApiLauncher, "resolvableApiLauncher");
        this.f9127Z = resolvableApiLauncher;
    }

    public C3032c(InterfaceC11256c internalLogger) {
        this.f9126Y = 20;
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f9127Z = internalLogger;
    }

    public C3032c(int i10) {
        this.f9126Y = i10;
        switch (i10) {
            case 7:
                this.f9127Z = (ExtraCroppingQuirk) AbstractC1762b.f5032a.m4579f(ExtraCroppingQuirk.class);
                break;
            case 8:
                this.f9127Z = new C2385o(3);
                break;
            case 10:
                this.f9127Z = new C17155e();
                break;
            case 25:
                this.f9127Z = new HashMap(3);
                break;
            case 27:
                this.f9127Z = new LinkedHashMap();
                break;
            case 28:
                this.f9127Z = new CountDownLatch(1);
                break;
            default:
                this.f9127Z = new HashSet();
                break;
        }
    }

    public C3032c(C3847l0 c3847l0) {
        this.f9126Y = 6;
        AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk = (AeFpsRangeLegacyQuirk) c3847l0.m4579f(AeFpsRangeLegacyQuirk.class);
        if (aeFpsRangeLegacyQuirk == null) {
            this.f9127Z = null;
        } else {
            this.f9127Z = aeFpsRangeLegacyQuirk.f32310a;
        }
    }

    public C3032c(float f10, float f11) {
        this.f9126Y = 29;
        this.f9127Z = new C13729E(f10, f11, 0.01f);
    }
}
