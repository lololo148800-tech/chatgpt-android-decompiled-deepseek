package p1008s8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p087D7.AbstractC1976c;
import p138F8.vJO.vRJidSveZHcTw;
import p214Ib.C3671n;
import p214Ib.C3676s;
import p214Ib.C3678u;
import p228J.AbstractC3794B0;
import p628Zk.GwZB.tpXhEMGxfXFVSh;
import p658b5.p659zh.MMVKXkcLpuHFDi;
import p775h2.AbstractC14376f;
import p846k4.C16340i;
import p909nm.AbstractC17678l;
import p911o0.AbstractC17792x;
import p926of.yRae.sVDIzpC;

/* JADX INFO: renamed from: s8.j */
/* JADX INFO: loaded from: classes.dex */
public final class C19481j {

    /* JADX INFO: renamed from: a */
    public final C16340i f61883a;

    /* JADX INFO: renamed from: b */
    public final long f61884b;

    /* JADX INFO: renamed from: c */
    public final int f61885c;

    /* JADX INFO: renamed from: d */
    public final String f61886d;

    /* JADX INFO: renamed from: e */
    public final C19473b f61887e;

    /* JADX INFO: renamed from: f */
    public final C19478g f61888f;

    /* JADX INFO: renamed from: g */
    public final C19480i f61889g;

    /* JADX INFO: renamed from: h */
    public final C19472a f61890h;

    /* JADX INFO: renamed from: i */
    public final C19479h f61891i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19481j)) {
            return false;
        }
        C19481j c19481j = (C19481j) obj;
        return this.f61883a.equals(c19481j.f61883a) && this.f61884b == c19481j.f61884b && this.f61885c == c19481j.f61885c && AbstractC16544l.m18089b(this.f61886d, c19481j.f61886d) && this.f61887e.equals(c19481j.f61887e) && this.f61888f.equals(c19481j.f61888f) && AbstractC16544l.m18089b(this.f61889g, c19481j.f61889g) && AbstractC16544l.m18089b(this.f61890h, c19481j.f61890h) && AbstractC16544l.m18089b(null, null) && this.f61891i.equals(c19481j.f61891i);
    }

    public final int hashCode() {
        int iHashCode = this.f61883a.hashCode() * 31;
        long j10 = this.f61884b;
        int iM527p = AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC12107L1.m13820k(this.f61885c, (((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + 391076367) * 31, 31), 31, this.f61886d), 31, this.f61887e.f61795a), 31, this.f61888f.f61875a);
        C19480i c19480i = this.f61889g;
        int iHashCode2 = (iM527p + (c19480i == null ? 0 : c19480i.f61882a.hashCode())) * 31;
        C19472a c19472a = this.f61890h;
        return this.f61891i.hashCode() + ((iHashCode2 + (c19472a != null ? c19472a.f61794a.hashCode() : 0)) * 961);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TelemetryConfigurationEvent(dd=");
        sb2.append(this.f61883a);
        sb2.append(", date=");
        sb2.append(this.f61884b);
        sb2.append(", service=dd-sdk-android, source=");
        switch (this.f61885c) {
            case 1:
                str = "ANDROID";
                break;
            case 2:
                str = "IOS";
                break;
            case 3:
                str = "BROWSER";
                break;
            case 4:
                str = "FLUTTER";
                break;
            case 5:
                str = "REACT_NATIVE";
                break;
            case 6:
                str = "UNITY";
                break;
            case 7:
                str = "KOTLIN_MULTIPLATFORM";
                break;
            default:
                str = "null";
                break;
        }
        sb2.append(str);
        sb2.append(", version=");
        sb2.append(this.f61886d);
        sb2.append(", application=");
        sb2.append(this.f61887e);
        sb2.append(", session=");
        sb2.append(this.f61888f);
        sb2.append(", view=");
        sb2.append(this.f61889g);
        sb2.append(", action=");
        sb2.append(this.f61890h);
        sb2.append(", experimentalFeatures=null, telemetry=");
        sb2.append(this.f61891i);
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }

    public C19481j(C16340i c16340i, long j10, int i10, String str, C19473b c19473b, C19478g c19478g, C19480i c19480i, C19472a c19472a, C19479h c19479h) {
        AbstractC14376f.m15825D(i10, "source");
        AbstractC16544l.m18094g(str, vRJidSveZHcTw.MDHhvbrZCDz);
        this.f61883a = c16340i;
        this.f61884b = j10;
        this.f61885c = i10;
        this.f61886d = str;
        this.f61887e = c19473b;
        this.f61888f = c19478g;
        this.f61889g = c19480i;
        this.f61890h = c19472a;
        this.f61891i = c19479h;
    }

    /* JADX INFO: renamed from: a */
    public final C3676s m20591a() {
        String str;
        String str2;
        String str3;
        C3676s c3676s = new C3676s();
        C3676s c3676s2 = new C3676s();
        c3676s2.m4393u(2L, "format_version");
        c3676s.m4391s("_dd", c3676s2);
        c3676s.m4394v("type", "telemetry");
        c3676s.m4393u(Long.valueOf(this.f61884b), "date");
        c3676s.m4394v(ReferencesHeader.SERVICE, "dd-sdk-android");
        c3676s.m4391s("source", new C3678u(AbstractC17792x.m19525h(this.f61885c)));
        c3676s.m4394v("version", this.f61886d);
        C19473b c19473b = this.f61887e;
        C3676s c3676s3 = new C3676s();
        c3676s3.m4394v(ParameterNames.f31999ID, c19473b.f61795a);
        c3676s.m4391s(SIPServerTransaction.CONTENT_TYPE_APPLICATION, c3676s3);
        C19478g c19478g = this.f61888f;
        C3676s c3676s4 = new C3676s();
        c3676s4.m4394v(ParameterNames.f31999ID, c19478g.f61875a);
        c3676s.m4391s(ParameterNames.SESSION, c3676s4);
        C19480i c19480i = this.f61889g;
        if (c19480i != null) {
            C3676s c3676s5 = new C3676s();
            c3676s5.m4394v(ParameterNames.f31999ID, c19480i.f61882a);
            c3676s.m4391s("view", c3676s5);
        }
        C19472a c19472a = this.f61890h;
        if (c19472a != null) {
            C3676s c3676s6 = new C3676s();
            c3676s6.m4394v(ParameterNames.f31999ID, c19472a.f61794a);
            c3676s.m4391s("action", c3676s6);
        }
        C19479h c19479h = this.f61891i;
        C3676s c3676s7 = new C3676s();
        C19475d c19475d = c19479h.f61877a;
        if (c19475d != null) {
            C3676s c3676s8 = new C3676s();
            String str4 = c19475d.f61867a;
            if (str4 != null) {
                c3676s8.m4394v("architecture", str4);
            }
            String str5 = c19475d.f61868b;
            if (str5 != null) {
                c3676s8.m4394v("brand", str5);
            }
            String str6 = c19475d.f61869c;
            if (str6 != null) {
                c3676s8.m4394v("model", str6);
            }
            c3676s7.m4391s("device", c3676s8);
        }
        C19476e c19476e = c19479h.f61878b;
        if (c19476e != null) {
            C3676s c3676s9 = new C3676s();
            String str7 = c19476e.f61870a;
            if (str7 != null) {
                c3676s9.m4394v("build", str7);
            }
            String str8 = c19476e.f61871b;
            if (str8 != null) {
                c3676s9.m4394v(DiagnosticsEntry.NAME_KEY, str8);
            }
            String str9 = c19476e.f61872c;
            if (str9 != null) {
                c3676s9.m4394v("version", str9);
            }
            c3676s7.m4391s("os", c3676s9);
        }
        c3676s7.m4394v("type", c19479h.f61881e);
        C19474c c19474c = c19479h.f61879c;
        c19474c.getClass();
        C3676s c3676s10 = new C3676s();
        Long l4 = c19474c.f61822a;
        if (l4 != null) {
            AbstractC17792x.m19539v(l4, c3676s10, "session_sample_rate");
        }
        Long l10 = c19474c.f61824b;
        if (l10 != null) {
            AbstractC17792x.m19539v(l10, c3676s10, "telemetry_sample_rate");
        }
        Long l11 = c19474c.f61826c;
        if (l11 != null) {
            AbstractC17792x.m19539v(l11, c3676s10, "telemetry_configuration_sample_rate");
        }
        Long l12 = c19474c.f61828d;
        if (l12 != null) {
            AbstractC17792x.m19539v(l12, c3676s10, "telemetry_usage_sample_rate");
        }
        Long l13 = c19474c.f61830e;
        if (l13 != null) {
            AbstractC17792x.m19539v(l13, c3676s10, "trace_sample_rate");
        }
        int i10 = c19474c.f61855q0;
        if (i10 != 0) {
            if (i10 == 1) {
                str3 = tpXhEMGxfXFVSh.VRnqZae;
            } else {
                if (i10 != 2) {
                    throw null;
                }
                str3 = "sampled";
            }
            c3676s10.m4391s("trace_context_injection", new C3678u(str3));
        }
        Long l14 = c19474c.f61832f;
        if (l14 != null) {
            AbstractC17792x.m19539v(l14, c3676s10, "premium_sample_rate");
        }
        Long l15 = c19474c.f61834g;
        if (l15 != null) {
            AbstractC17792x.m19539v(l15, c3676s10, "replay_sample_rate");
        }
        Long l16 = c19474c.f61836h;
        if (l16 != null) {
            AbstractC17792x.m19539v(l16, c3676s10, "session_replay_sample_rate");
        }
        int i11 = c19474c.f61857r0;
        if (i11 != 0) {
            if (i11 == 1) {
                str2 = "granted";
            } else if (i11 == 2) {
                str2 = "not-granted";
            } else {
                if (i11 != 3) {
                    throw null;
                }
                str2 = "pending";
            }
            c3676s10.m4391s("tracking_consent", new C3678u(str2));
        }
        Boolean bool = c19474c.f61838i;
        if (bool != null) {
            c3676s10.m4392t(bool, "start_session_replay_recording_manually");
        }
        Boolean bool2 = c19474c.f61840j;
        if (bool2 != null) {
            c3676s10.m4392t(bool2, "start_recording_immediately");
        }
        Boolean bool3 = c19474c.f61842k;
        if (bool3 != null) {
            c3676s10.m4392t(bool3, "use_proxy");
        }
        Boolean bool4 = c19474c.f61844l;
        if (bool4 != null) {
            c3676s10.m4392t(bool4, "use_before_send");
        }
        Boolean bool5 = c19474c.f61846m;
        if (bool5 != null) {
            c3676s10.m4392t(bool5, "silent_multiple_init");
        }
        Boolean bool6 = c19474c.f61848n;
        if (bool6 != null) {
            c3676s10.m4392t(bool6, "track_session_across_subdomains");
        }
        Boolean bool7 = c19474c.f61850o;
        if (bool7 != null) {
            c3676s10.m4392t(bool7, "track_resources");
        }
        Boolean bool8 = c19474c.f61852p;
        if (bool8 != null) {
            c3676s10.m4392t(bool8, "track_long_task");
        }
        Boolean bool9 = c19474c.f61854q;
        if (bool9 != null) {
            c3676s10.m4392t(bool9, "use_cross_site_session_cookie");
        }
        Boolean bool10 = c19474c.f61856r;
        if (bool10 != null) {
            c3676s10.m4392t(bool10, "use_partitioned_cross_site_session_cookie");
        }
        Boolean bool11 = c19474c.f61858s;
        if (bool11 != null) {
            c3676s10.m4392t(bool11, "use_secure_session_cookie");
        }
        Boolean bool12 = c19474c.f61860t;
        if (bool12 != null) {
            c3676s10.m4392t(bool12, "allow_fallback_to_local_storage");
        }
        Boolean bool13 = c19474c.f61861u;
        if (bool13 != null) {
            c3676s10.m4392t(bool13, "store_contexts_across_pages");
        }
        Boolean bool14 = c19474c.f61862v;
        if (bool14 != null) {
            c3676s10.m4392t(bool14, "allow_untrusted_events");
        }
        String str10 = c19474c.f61863w;
        if (str10 != null) {
            c3676s10.m4394v("action_name_attribute", str10);
        }
        Boolean bool15 = c19474c.f61864x;
        if (bool15 != null) {
            c3676s10.m4392t(bool15, "use_allowed_tracing_origins");
        }
        Boolean bool16 = c19474c.f61865y;
        if (bool16 != null) {
            c3676s10.m4392t(bool16, "use_allowed_tracing_urls");
        }
        List list = c19474c.f61866z;
        if (list != null) {
            C3671n c3671n = new C3671n(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c3671n.m4385s(new C3678u(((EnumC19477f) it.next()).f61874Y));
            }
            c3676s10.m4391s("selected_tracing_propagators", c3671n);
        }
        String str11 = c19474c.f61796A;
        if (str11 != null) {
            c3676s10.m4394v("default_privacy_level", str11);
        }
        String str12 = c19474c.f61797B;
        if (str12 != null) {
            c3676s10.m4394v("text_and_input_privacy_level", str12);
        }
        String str13 = c19474c.f61798C;
        if (str13 != null) {
            c3676s10.m4394v("image_privacy_level", str13);
        }
        String str14 = c19474c.f61799D;
        if (str14 != null) {
            c3676s10.m4394v("touch_privacy_level", str14);
        }
        Boolean bool17 = c19474c.f61800E;
        if (bool17 != null) {
            c3676s10.m4392t(bool17, MMVKXkcLpuHFDi.QWrbKqaHHhMq);
        }
        Boolean bool18 = c19474c.f61801F;
        if (bool18 != null) {
            c3676s10.m4392t(bool18, "use_excluded_activity_urls");
        }
        Boolean bool19 = c19474c.f61802G;
        if (bool19 != null) {
            c3676s10.m4392t(bool19, "use_worker_url");
        }
        Boolean bool20 = c19474c.f61803H;
        if (bool20 != null) {
            c3676s10.m4392t(bool20, "compress_intake_requests");
        }
        Boolean bool21 = c19474c.f61804I;
        if (bool21 != null) {
            c3676s10.m4392t(bool21, "track_frustrations");
        }
        Boolean bool22 = c19474c.f61805J;
        if (bool22 != null) {
            c3676s10.m4392t(bool22, "track_views_manually");
        }
        Boolean bool23 = c19474c.f61806K;
        if (bool23 != null) {
            c3676s10.m4392t(bool23, "track_interactions");
        }
        Boolean bool24 = c19474c.f61807L;
        if (bool24 != null) {
            c3676s10.m4392t(bool24, "track_user_interactions");
        }
        Boolean bool25 = c19474c.f61808M;
        if (bool25 != null) {
            c3676s10.m4392t(bool25, "forward_errors_to_logs");
        }
        List list2 = c19474c.f61809N;
        if (list2 != null) {
            C3671n c3671n2 = new C3671n(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                c3671n2.m4386t((String) it2.next());
            }
            c3676s10.m4391s(sVDIzpC.TVQVsGwso, c3671n2);
        }
        List list3 = c19474c.f61810O;
        if (list3 != null) {
            C3671n c3671n3 = new C3671n(list3.size());
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                c3671n3.m4386t((String) it3.next());
            }
            c3676s10.m4391s("forward_reports", c3671n3);
        }
        Boolean bool26 = c19474c.f61811P;
        if (bool26 != null) {
            c3676s10.m4392t(bool26, "use_local_encryption");
        }
        int i12 = c19474c.f61859s0;
        if (i12 != 0) {
            if (i12 == 1) {
                str = "ActivityViewTrackingStrategy";
            } else if (i12 == 2) {
                str = "FragmentViewTrackingStrategy";
            } else if (i12 == 3) {
                str = "MixedViewTrackingStrategy";
            } else {
                if (i12 != 4) {
                    throw null;
                }
                str = "NavigationViewTrackingStrategy";
            }
            c3676s10.m4391s("view_tracking_strategy", new C3678u(str));
        }
        Boolean bool27 = c19474c.f61812Q;
        if (bool27 != null) {
            c3676s10.m4392t(bool27, "track_background_events");
        }
        Long l17 = c19474c.f61813R;
        if (l17 != null) {
            AbstractC17792x.m19539v(l17, c3676s10, "mobile_vitals_update_period");
        }
        Boolean bool28 = c19474c.f61814S;
        if (bool28 != null) {
            c3676s10.m4392t(bool28, "track_errors");
        }
        Boolean bool29 = c19474c.f61815T;
        if (bool29 != null) {
            c3676s10.m4392t(bool29, "track_network_requests");
        }
        Boolean bool30 = c19474c.f61816U;
        if (bool30 != null) {
            c3676s10.m4392t(bool30, "use_tracing");
        }
        Boolean bool31 = c19474c.f61817V;
        if (bool31 != null) {
            c3676s10.m4392t(bool31, "track_native_views");
        }
        Boolean bool32 = c19474c.f61818W;
        if (bool32 != null) {
            c3676s10.m4392t(bool32, "track_native_errors");
        }
        Boolean bool33 = c19474c.f61819X;
        if (bool33 != null) {
            c3676s10.m4392t(bool33, "track_native_long_tasks");
        }
        Boolean bool34 = c19474c.f61820Y;
        if (bool34 != null) {
            c3676s10.m4392t(bool34, "track_cross_platform_long_tasks");
        }
        Boolean bool35 = c19474c.f61821Z;
        if (bool35 != null) {
            c3676s10.m4392t(bool35, "use_first_party_hosts");
        }
        String str15 = c19474c.f61823a0;
        if (str15 != null) {
            c3676s10.m4394v("initialization_type", str15);
        }
        Boolean bool36 = c19474c.f61825b0;
        if (bool36 != null) {
            c3676s10.m4392t(bool36, "track_flutter_performance");
        }
        Long l18 = c19474c.f61827c0;
        if (l18 != null) {
            AbstractC17792x.m19539v(l18, c3676s10, "batch_size");
        }
        Long l19 = c19474c.f61829d0;
        if (l19 != null) {
            AbstractC17792x.m19539v(l19, c3676s10, "batch_upload_frequency");
        }
        Long l20 = c19474c.f61831e0;
        if (l20 != null) {
            AbstractC17792x.m19539v(l20, c3676s10, "batch_processing_level");
        }
        Boolean bool37 = c19474c.f61833f0;
        if (bool37 != null) {
            c3676s10.m4392t(bool37, "background_tasks_enabled");
        }
        String str16 = c19474c.f61835g0;
        if (str16 != null) {
            c3676s10.m4394v("react_version", str16);
        }
        String str17 = c19474c.f61837h0;
        if (str17 != null) {
            c3676s10.m4394v("react_native_version", str17);
        }
        String str18 = c19474c.f61839i0;
        if (str18 != null) {
            c3676s10.m4394v("dart_version", str18);
        }
        String str19 = c19474c.f61841j0;
        if (str19 != null) {
            c3676s10.m4394v("unity_version", str19);
        }
        Long l21 = c19474c.f61843k0;
        if (l21 != null) {
            AbstractC17792x.m19539v(l21, c3676s10, "app_hang_threshold");
        }
        Boolean bool38 = c19474c.f61845l0;
        if (bool38 != null) {
            c3676s10.m4392t(bool38, "use_pci_intake");
        }
        String str20 = c19474c.f61847m0;
        if (str20 != null) {
            c3676s10.m4394v("tracer_api", str20);
        }
        String str21 = c19474c.f61849n0;
        if (str21 != null) {
            c3676s10.m4394v("tracer_api_version", str21);
        }
        Boolean bool39 = c19474c.f61851o0;
        if (bool39 != null) {
            c3676s10.m4392t(bool39, "send_logs_after_session_expiration");
        }
        List list4 = c19474c.f61853p0;
        if (list4 != null) {
            C3671n c3671n4 = new C3671n(list4.size());
            Iterator it4 = list4.iterator();
            if (it4.hasNext()) {
                throw AbstractC3794B0.m4497v(it4);
            }
            c3676s10.m4391s("plugins", c3671n4);
        }
        c3676s7.m4391s("configuration", c3676s10);
        for (Map.Entry entry : c19479h.f61880d.entrySet()) {
            String str22 = (String) entry.getKey();
            Object value = entry.getValue();
            if (!AbstractC17678l.m19298e(str22, C19479h.f61876f)) {
                c3676s7.m4391s(str22, AbstractC1976c.m3153j(value));
            }
        }
        c3676s.m4391s("telemetry", c3676s7);
        return c3676s;
    }
}
