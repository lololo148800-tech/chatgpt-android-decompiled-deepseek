package android.javax.sip;

import android.app.Application;
import android.content.ClipData;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraCaptureSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.ContentInfo;
import android.view.View;
import androidx.fragment.app.AbstractComponentCallbacksC11000a;
import com.auth0.android.provider.lcl.qffLJgOYizGmMj;
import io.livekit.audio.krisp.KrispAudioProcessor;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.internal.debugmeta.C15384c;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import livekit.org.webrtc.FrameCryptorFactory;
import livekit.org.webrtc.FrameCryptorKeyProvider;
import mm.C17309l;
import mo.AbstractC17329F;
import mo.C17327D;
import mo.InterfaceC17338e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001A.AbstractC0010F;
import p001A.C0087s0;
import p003A1.AbstractC0259j;
import p025An.C0644w;
import p026Ao.C0654C;
import p026Ao.C0681o;
import p028B.C0701h;
import p030B2.C0794y0;
import p030B2.InterfaceC0753e;
import p030B2.InterfaceC0783t;
import p033B5.AbstractC0833q;
import p033B5.C0816A;
import p033B5.C0817a;
import p033B5.C0825i;
import p033B5.C0840x;
import p033B5.InterfaceC0829m;
import p049Bm.InterfaceC1436k;
import p1009s9.C19506i;
import p1022t9.AbstractC19821f;
import p1036u9.InterfaceC20165k;
import p1050v.InterfaceC20412a;
import p1061vb.C20513d;
import p1078w9.AbstractC20851a;
import p1113xn.C21307a;
import p1139z0.C21585H;
import p1155zi.C21907E;
import p1160zp.AbstractC22225a;
import p167Gb.C3032c;
import p178H.C3123P;
import p184H5.C3234a;
import p189Ha.AbstractC3276j;
import p208I5.C3620a;
import p209I6.C3645w;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3776x;
import p235J6.C4271h;
import p235J6.C4273j;
import p238J9.BinderC4294b;
import p259K5.C4539a;
import p259K5.C4540b;
import p259K5.C4541c;
import p259K5.C4543e;
import p259K5.C4544f;
import p263K9.C4603w;
import p301M.InterfaceC5221c;
import p310M9.C5311e;
import p333N9.AbstractC5688i;
import p333N9.BinderC5681b;
import p333N9.C5684e;
import p333N9.C5693n;
import p357Oa.C6149b;
import p374P5.AbstractC6355h;
import p374P5.AbstractC6356i;
import p374P5.C6354g;
import p374P5.C6361n;
import p375P6.AbstractTextureViewSurfaceTextureListenerC6373j;
import p375P6.InterfaceC6367d;
import p389Pn.AbstractC6529n;
import p389Pn.C6534s;
import p389Pn.C6538w;
import p397Q5.C6572a;
import p397Q5.C6579h;
import p397Q5.EnumC6575d;
import p397Q5.EnumC6578g;
import p397Q5.InterfaceC6574c;
import p437Rn.InterfaceC6943a;
import p449S9.AbstractC7075j;
import p449S9.C7090q0;
import p449S9.C7092r0;
import p477Tb.C7296c;
import p496U5.AbstractC7568j;
import p523V9.AbstractC8072d6;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p571X9.AbstractC9131F4;
import p571X9.AbstractC9137G4;
import p571X9.AbstractC9306j0;
import p588Y2.C9637u;
import p610Z1.C10142i;
import p658b5.C11241l;
import p661b7.InterfaceC11256c;
import p720e6.C13287b;
import p720e6.C13288c;
import p746fa.C13599h;
import p841k.InterfaceC16289i;
import p867l8.C16831c;
import p903n9.C17531e;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p959q8.C18639a;
import p960q9.C18655i;
import p974qo.C18792h;

/* JADX INFO: renamed from: android.javax.sip.o */
/* JADX INFO: loaded from: classes.dex */
public final class C10808o implements InterfaceC5221c, InterfaceC0753e, InterfaceC0783t, InterfaceC20165k, DFS.Neighbors, InterfaceC6367d, InterfaceC6943a, InterfaceC20412a, InterfaceC17338e {

    /* JADX INFO: renamed from: o0 */
    public static C10808o f32038o0;

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f32039Y;

    /* JADX INFO: renamed from: Z */
    public Object f32040Z;

    public /* synthetic */ C10808o(int i10, boolean z6) {
        this.f32039Y = i10;
    }

    /* JADX INFO: renamed from: i */
    public static synchronized C10808o m11071i() {
        try {
            if (f32038o0 == null) {
                C10808o c10808o = new C10808o(0, false);
                c10808o.f32040Z = null;
                new LinkedList();
                new Hashtable();
                f32038o0 = c10808o;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f32038o0;
    }

    /* JADX INFO: renamed from: y */
    public static String m11073y(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    /* JADX INFO: renamed from: A */
    public void m11074A(long j10) throws IOException {
        long jM11075B = m11075B();
        if (jM11075B != j10) {
            if (jM11075B != -1) {
                if (jM11075B != -2) {
                    return;
                } else {
                    jM11075B = -2;
                }
            }
            StringBuilder sbM9894m = AbstractC9306j0.m9894m("expected non-string scope or scope ", j10, " but found ");
            sbM9894m.append(jM11075B);
            throw new IOException(sbM9894m.toString());
        }
    }

    /* JADX INFO: renamed from: B */
    public long m11075B() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f32040Z;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // p301M.InterfaceC5221c
    /* JADX INFO: renamed from: J */
    public void mo3912J(Throwable th2) {
        switch (this.f32039Y) {
            case 1:
                synchronized (((C0087s0) this.f32040Z).f339a) {
                    try {
                        ((C0087s0) this.f32040Z).f342d.m185u();
                        int iM24h = AbstractC0010F.m24h(((C0087s0) this.f32040Z).f347i);
                        if ((iM24h == 3 || iM24h == 5 || iM24h == 6) && !(th2 instanceof CancellationException)) {
                            AbstractC8072d6.m8493j("CaptureSession", "Opening session with fail ".concat(AbstractC0010F.m26j(((C0087s0) this.f32040Z).f347i)), th2);
                            ((C0087s0) this.f32040Z).m282d();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
            default:
                ((C10142i) this.f32040Z).m10748b(th2);
                return;
        }
    }

    @Override // p030B2.InterfaceC0753e
    /* JADX INFO: renamed from: a */
    public ClipData mo1604a() {
        return ((ContentInfo) this.f32040Z).getClip();
    }

    @Override // p1036u9.InterfaceC20165k
    public void accept(Object obj, Object obj2) {
        switch (this.f32039Y) {
            case 13:
                BinderC4294b binderC4294b = new BinderC4294b((C13599h) obj2, 0);
                C7092r0 c7092r0 = (C7092r0) ((C7090q0) obj).m13209q();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(c7092r0.f22579b);
                int i10 = AbstractC7075j.f22551a;
                parcelObtain.writeStrongBinder(binderC4294b);
                C4603w c4603w = (C4603w) this.f32040Z;
                parcelObtain.writeInt(1);
                c4603w.writeToParcel(parcelObtain, 0);
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    c7092r0.f22578a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return;
                } finally {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                }
            default:
                BinderC5681b binderC5681b = new BinderC5681b((C13599h) obj2, 1);
                C5693n c5693n = (C5693n) ((C5684e) obj).m13209q();
                C17531e c17531e = (C17531e) this.f32040Z;
                Parcel parcelM6113i = c5693n.m6113i();
                int i11 = AbstractC5688i.f18460a;
                parcelM6113i.writeStrongBinder(binderC5681b);
                AbstractC5688i.m6133c(parcelM6113i, c17531e);
                c5693n.m6114k(parcelM6113i, 1);
                return;
        }
    }

    @Override // p1050v.InterfaceC20412a, p644ab.InterfaceC10532e
    /* JADX INFO: renamed from: apply */
    public Object mo22421apply(Object obj) {
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = (AbstractComponentCallbacksC11000a) this.f32040Z;
        C9637u c9637u = abstractComponentCallbacksC11000a.f33123E0;
        return c9637u instanceof InterfaceC16289i ? c9637u.f29054q0.f32069u0 : abstractComponentCallbacksC11000a.m11742L().f32069u0;
    }

    @Override // mo.InterfaceC17338e
    /* JADX INFO: renamed from: b */
    public void mo1006b(C18792h call, C17327D c17327d) {
        AbstractC16544l.m18094g(call, "call");
        KrispAudioProcessor krispAudioProcessor = (KrispAudioProcessor) this.f32040Z;
        synchronized (krispAudioProcessor.f46977g) {
            try {
                if (AbstractC16544l.m18089b(krispAudioProcessor.f46976f, call) && c17327d.f55176p0 == 200) {
                    AbstractC17329F abstractC17329F = c17327d.f55179s0;
                    String strM18991k = abstractC17329F != null ? abstractC17329F.m18991k() : null;
                    if (strM18991k == null) {
                        C8395g c8395g = AbstractC8396h.Companion;
                        EnumC8397i enumC8397i = EnumC8397i.f26120q0;
                        AbstractC8396h.Companion.getClass();
                        if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                            AbstractC22225a.f70470a.getClass();
                            C16831c.m18568f(new Object[0]);
                        }
                    } else {
                        C8395g c8395g2 = AbstractC8396h.Companion;
                        EnumC8397i enumC8397i2 = EnumC8397i.f26117Z;
                        AbstractC8396h.Companion.getClass();
                        if (enumC8397i2.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                            "Response:-".concat(strM18991k);
                            AbstractC22225a.f70470a.getClass();
                            C16831c.m18567d(new Object[0]);
                        }
                        try {
                            JSONObject jSONObject = new JSONObject(strM18991k);
                            jSONObject.has("enhancedNoiseCancellation");
                            krispAudioProcessor.f46975e.set(jSONObject.getBoolean("enhancedNoiseCancellation"));
                        } catch (Exception unused) {
                            C8395g c8395g3 = AbstractC8396h.Companion;
                            EnumC8397i enumC8397i3 = EnumC8397i.f26120q0;
                            AbstractC8396h.Companion.getClass();
                            if (enumC8397i3.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                                AbstractC22225a.f70470a.getClass();
                                C16831c.m18568f(new Object[0]);
                            }
                        }
                        krispAudioProcessor.f46976f = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p030B2.InterfaceC0753e
    /* JADX INFO: renamed from: c */
    public int mo1605c() {
        return ((ContentInfo) this.f32040Z).getFlags();
    }

    @Override // p437Rn.InterfaceC6943a
    /* JADX INFO: renamed from: d */
    public Object mo7094d(Object obj, Object obj2) {
        String newValue = (String) obj2;
        AbstractC16544l.m18094g(newValue, "newValue");
        AbstractC6529n abstractC6529n = (AbstractC6529n) this.f32040Z;
        C6534s c6534s = abstractC6529n.f21142a.f21156a;
        List list = abstractC6529n.f21143b;
        int iIndexOf = list.indexOf(newValue);
        C6538w c6538w = abstractC6529n.f21142a;
        Integer num = (Integer) c6534s.mo7094d(obj, Integer.valueOf(iIndexOf + c6538w.f21157b));
        if (num != null) {
            return (String) list.get(num.intValue() - c6538w.f21157b);
        }
        return null;
    }

    @Override // p030B2.InterfaceC0753e
    /* JADX INFO: renamed from: e */
    public ContentInfo mo1606e() {
        return (ContentInfo) this.f32040Z;
    }

    /* JADX INFO: renamed from: f */
    public boolean m11076f(String str) {
        String strM11081n = m11081n(str);
        return "1".equals(strM11081n) || Boolean.parseBoolean(strM11081n);
    }

    /* JADX INFO: renamed from: g */
    public C4540b m11077g(C6354g c6354g, C4539a c4539a, C6579h c6579h, EnumC6578g enumC6578g) {
        C4540b c4540bMo5314j;
        int iAbs;
        if (!c6354g.f20670j.f20616Y) {
            return null;
        }
        C4541c c4541c = (C4541c) ((C0840x) this.f32040Z).f2343a.f2318c.getValue();
        if (c4541c != null) {
            synchronized (c4541c.f14846c) {
                try {
                    c4540bMo5314j = c4541c.f14844a.mo5314j(c4539a);
                    if (c4540bMo5314j == null) {
                        C4544f c4544f = c4541c.f14845b;
                        ArrayList arrayList = (ArrayList) c4544f.f14853a.get(c4539a);
                        C4540b c4540b = null;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                C4543e c4543e = (C4543e) arrayList.get(i10);
                                InterfaceC0829m interfaceC0829m = (InterfaceC0829m) c4543e.f14850a.get();
                                C4540b c4540b2 = interfaceC0829m != null ? new C4540b(interfaceC0829m, c4543e.f14851b) : null;
                                if (c4540b2 != null) {
                                    c4540b = c4540b2;
                                    break;
                                }
                            }
                            c4544f.m5308b();
                        }
                        c4540bMo5314j = c4540b;
                    }
                    if (c4540bMo5314j != null && !c4540bMo5314j.f14842a.mo1877c()) {
                        c4541c.m5305c(c4539a);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            c4540bMo5314j = null;
        }
        if (c4540bMo5314j == null) {
            return null;
        }
        InterfaceC0829m interfaceC0829m2 = c4540bMo5314j.f14842a;
        C0817a c0817a = interfaceC0829m2 instanceof C0817a ? (C0817a) interfaceC0829m2 : null;
        if (c0817a != null) {
            Bitmap.Config config = c0817a.f2281a.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            if (AbstractC9131F4.m9673b(config) && !((Boolean) AbstractC0833q.m1891d(c6354g, AbstractC6356i.f20691h)).booleanValue()) {
                return null;
            }
        }
        String str = (String) c4539a.f14841b.get("coil#size");
        if (str == null) {
            Object obj = c4540bMo5314j.f14843b.get("coil#is_sampled");
            Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            EnumC6575d enumC6575d = c6354g.f20678r;
            if (zBooleanValue || (!AbstractC16544l.m18089b(c6579h, C6579h.f21264c) && enumC6575d != EnumC6575d.f21259Z)) {
                int width = interfaceC0829m2.getWidth();
                int height = interfaceC0829m2.getHeight();
                C6579h c6579h2 = interfaceC0829m2 instanceof C0817a ? (C6579h) AbstractC0833q.m1891d(c6354g, AbstractC6355h.f20682a) : C6579h.f21264c;
                InterfaceC6574c interfaceC6574c = c6579h.f21265a;
                int i11 = interfaceC6574c instanceof C6572a ? ((C6572a) interfaceC6574c).f21256a : Integer.MAX_VALUE;
                InterfaceC6574c interfaceC6574c2 = c6579h2.f21265a;
                int iMin = Math.min(i11, interfaceC6574c2 instanceof C6572a ? ((C6572a) interfaceC6574c2).f21256a : Integer.MAX_VALUE);
                InterfaceC6574c interfaceC6574c3 = c6579h.f21266b;
                int i12 = interfaceC6574c3 instanceof C6572a ? ((C6572a) interfaceC6574c3).f21256a : Integer.MAX_VALUE;
                InterfaceC6574c interfaceC6574c4 = c6579h2.f21266b;
                int iMin2 = Math.min(i12, interfaceC6574c4 instanceof C6572a ? ((C6572a) interfaceC6574c4).f21256a : Integer.MAX_VALUE);
                double d10 = ((double) iMin) / ((double) width);
                double d11 = ((double) iMin2) / ((double) height);
                int iOrdinal = ((iMin == Integer.MAX_VALUE || iMin2 == Integer.MAX_VALUE) ? EnumC6578g.f21262Z : enumC6578g).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        throw new C0644w();
                    }
                    if (d10 < d11) {
                        iAbs = Math.abs(iMin - width);
                    } else {
                        iAbs = Math.abs(iMin2 - height);
                        d10 = d11;
                    }
                } else if (d10 > d11) {
                    iAbs = Math.abs(iMin - width);
                } else {
                    iAbs = Math.abs(iMin2 - height);
                    d10 = d11;
                }
                if (iAbs > 1) {
                    int iOrdinal2 = enumC6575d.ordinal();
                    if (iOrdinal2 != 0) {
                        if (iOrdinal2 != 1) {
                            throw new C0644w();
                        }
                        if (d10 > 1.0d) {
                            return null;
                        }
                    } else if (d10 != 1.0d) {
                        return null;
                    }
                }
            }
        } else if (!str.equals(c6579h.toString())) {
            return null;
        }
        return c4540bMo5314j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        InterfaceC3776x[] interfaceC3776xArr = JvmBuiltInsCustomizer.f51371i;
        Collection<KotlinType> supertypes = ((ClassDescriptor) obj).getTypeConstructor().getSupertypes();
        AbstractC16544l.m18093f(supertypes, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = ((KotlinType) it.next()).getConstructor().mo22589getDeclarationDescriptor();
            ClassDescriptor classDescriptorM18121a = null;
            ClassifierDescriptor original = classifierDescriptorMo22589getDeclarationDescriptor != null ? classifierDescriptorMo22589getDeclarationDescriptor.getOriginal() : null;
            ClassDescriptor classDescriptor = original instanceof ClassDescriptor ? (ClassDescriptor) original : null;
            if (classDescriptor != null && (classDescriptorM18121a = ((JvmBuiltInsCustomizer) this.f32040Z).m18121a(classDescriptor)) == null) {
                classDescriptorM18121a = classDescriptor;
            }
            if (classDescriptorM18121a != null) {
                arrayList.add(classDescriptorM18121a);
            }
        }
        return arrayList;
    }

    @Override // p030B2.InterfaceC0753e
    public int getSource() {
        return ((ContentInfo) this.f32040Z).getSource();
    }

    @Override // mo.InterfaceC17338e
    /* JADX INFO: renamed from: h */
    public void mo1007h(C18792h call, IOException iOException) {
        AbstractC16544l.m18094g(call, "call");
        KrispAudioProcessor krispAudioProcessor = (KrispAudioProcessor) this.f32040Z;
        synchronized (krispAudioProcessor.f46977g) {
            try {
                if (AbstractC16544l.m18089b(krispAudioProcessor.f46976f, call) && !call.f59718A0) {
                    C8395g c8395g = AbstractC8396h.Companion;
                    EnumC8397i enumC8397i = EnumC8397i.f26120q0;
                    AbstractC8396h.Companion.getClass();
                    if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                        AbstractC22225a.f70470a.getClass();
                        C16831c.m18568f(new Object[0]);
                    }
                }
                krispAudioProcessor.f46976f = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public Integer m11078j(String str) {
        String strM11081n = m11081n(str);
        if (TextUtils.isEmpty(strM11081n)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strM11081n));
        } catch (NumberFormatException unused) {
            AbstractC15256t.m16482t("NotificationParams", "Couldn't parse value of " + m11073y(str) + Separators.LPAREN + strM11081n + ") into an int");
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public JSONArray m11079k(String str) {
        String strM11081n = m11081n(str);
        if (TextUtils.isEmpty(strM11081n)) {
            return null;
        }
        try {
            return new JSONArray(strM11081n);
        } catch (JSONException unused) {
            AbstractC15256t.m16482t("NotificationParams", "Malformed JSON for key " + m11073y(str) + ": " + strM11081n + ", falling back to default");
            return null;
        }
    }

    @Override // p030B2.InterfaceC0783t
    /* JADX INFO: renamed from: l */
    public C0794y0 mo1773l(View view, C0794y0 c0794y0) {
        int iM1813a = c0794y0.m1813a();
        AbstractC3276j abstractC3276j = (AbstractC3276j) this.f32040Z;
        abstractC3276j.f9983n = iM1813a;
        abstractC3276j.f9984o = c0794y0.m1814b();
        abstractC3276j.f9985p = c0794y0.m1815c();
        abstractC3276j.m4155f();
        return c0794y0;
    }

    /* JADX INFO: renamed from: m */
    public String m11080m(Resources resources, String str, String str2) {
        String[] strArr;
        String strM11081n = m11081n(str2);
        if (!TextUtils.isEmpty(strM11081n)) {
            return strM11081n;
        }
        String strM11081n2 = m11081n(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(strM11081n2)) {
            return null;
        }
        int identifier = resources.getIdentifier(strM11081n2, "string", str);
        if (identifier == 0) {
            AbstractC15256t.m16482t("NotificationParams", m11073y(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray jSONArrayM11079k = m11079k(str2.concat("_loc_args"));
        if (jSONArrayM11079k == null) {
            strArr = null;
        } else {
            int length = jSONArrayM11079k.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = jSONArrayM11079k.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e10) {
            AbstractC15256t.m16483u("NotificationParams", "Missing format argument for " + m11073y(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public String m11081n(String str) {
        Bundle bundle = (Bundle) this.f32040Z;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    @Override // p301M.InterfaceC5221c, p746fa.InterfaceC13596e
    public void onSuccess(Object obj) {
        switch (this.f32039Y) {
            case 1:
                break;
            default:
                C10142i c10142i = (C10142i) this.f32040Z;
                try {
                    c10142i.m10747a(obj);
                } catch (Throwable th2) {
                    c10142i.m10748b(th2);
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c4  */
    /* JADX INFO: renamed from: p */
    public C4539a m11082p(C6354g c6354g, Object obj, C6361n c6361n, C0825i c0825i) {
        String string;
        String strM1893f;
        c6354g.getClass();
        Map map = c6354g.f20664d;
        List list = ((C0840x) this.f32040Z).f2345c.f2299c;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                C17309l c17309l = (C17309l) list.get(i10);
                C3620a c3620a = (C3620a) c17309l.f55136Y;
                if (((InterfaceC3756d) c17309l.f55137Z).mo4449e(obj)) {
                    AbstractC16544l.m18092e(c3620a, "null cannot be cast to non-null type coil3.key.Keyer<kotlin.Any>");
                    switch (c3620a.f11037a) {
                        case 0:
                            C0816A c0816a = (C0816A) obj;
                            if (!AbstractC16544l.m18089b(c0816a.f2278c, "android.resource")) {
                                string = null;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(c0816a);
                                sb2.append(':');
                                Configuration configuration = c6361n.f20697a.getResources().getConfiguration();
                                Bitmap.Config[] configArr = AbstractC7568j.f23971a;
                                sb2.append(configuration.uiMode & 48);
                                string = sb2.toString();
                            }
                            break;
                        case 1:
                            C0816A c0816a2 = (C0816A) obj;
                            String str = c0816a2.f2278c;
                            if (!(str == null || str.equals("file")) || c0816a2.f2280e == null) {
                                string = null;
                            } else {
                                Bitmap.Config[] configArr2 = AbstractC7568j.f23971a;
                                if ((AbstractC16544l.m18089b(c0816a2.f2278c, "file") && AbstractC16544l.m18089b(AbstractC17680n.m19343S(AbstractC0833q.m1894g(c0816a2)), "android_asset")) || !((Boolean) AbstractC0833q.m1892e(c6361n, AbstractC6355h.f20683b)).booleanValue() || (strM1893f = AbstractC0833q.m1893f(c0816a2)) == null) {
                                    string = null;
                                } else {
                                    String str2 = C0654C.f1910Z;
                                    C0681o c0681oM1464f = c6361n.f20702f.m1464f(C20513d.m21169n(strM1893f, false));
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(c0816a2);
                                    sb3.append('-');
                                    sb3.append((Long) c0681oM1464f.f1988g);
                                    string = sb3.toString();
                                }
                            }
                            break;
                        case 2:
                            string = ((C0816A) obj).f2276a;
                            break;
                        default:
                            String data = ((C21907E) obj).f69451a;
                            AbstractC16544l.m18094g(data, "data");
                            string = "AssetPointer(value=" + data + Separators.RPAREN;
                            break;
                    }
                    if (string != null) {
                    }
                }
                i10++;
            } else {
                string = null;
            }
        }
        if (string == null) {
            return null;
        }
        LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(map);
        if (!((List) AbstractC0833q.m1891d(c6354g, AbstractC6356i.f20684a)).isEmpty()) {
            linkedHashMapM19256r.put("coil#size", c6361n.f20698b.toString());
        }
        return new C4539a(string, linkedHashMapM19256r);
    }

    /* JADX INFO: renamed from: q */
    public void m11083q(String str) {
        ((C3645w) this.f32040Z).f11124g.mo2524p(new C4271h(str));
    }

    /* JADX INFO: renamed from: r */
    public void m11084r(String str, Map map) {
        ((C3645w) this.f32040Z).f11124g.mo2524p(new C4273j(str, map));
    }

    /* JADX INFO: renamed from: s */
    public Bundle m11085s() {
        Bundle bundle = (Bundle) this.f32040Z;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: t */
    public void m11086t(String str) {
        ((SharedPreferences) this.f32040Z).edit().remove(str).apply();
    }

    public String toString() {
        switch (this.f32039Y) {
            case 3:
                return "ContentInfoCompat{" + ((ContentInfo) this.f32040Z) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public String m11087u(String str) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f32040Z;
        if (sharedPreferences.contains(str)) {
            return sharedPreferences.getString(str, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public boolean m11088v(C4539a c4539a, C6354g c6354g, C3234a c3234a) {
        C4541c c4541c;
        if (c4539a == null || !c6354g.f20670j.f20617Z || !c3234a.f9806a.mo1877c() || (c4541c = (C4541c) ((C0840x) this.f32040Z).f2343a.f2318c.getValue()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("coil#is_sampled", Boolean.valueOf(c3234a.f9807b));
        String str = c3234a.f9809d;
        if (str != null) {
            linkedHashMap.put("coil#disk_cache_key", str);
        }
        InterfaceC0829m interfaceC0829m = c3234a.f9806a;
        Map mapM9681c = AbstractC9137G4.m9681c(linkedHashMap);
        synchronized (c4541c.f14846c) {
            long jMo1876b = interfaceC0829m.mo1876b();
            if (jMo1876b < 0) {
                throw new IllegalStateException(("Image size must be non-negative: " + jMo1876b).toString());
            }
            c4541c.f14844a.mo5316q(c4539a, interfaceC0829m, mapM9681c, jMo1876b);
        }
        return true;
    }

    /* JADX INFO: renamed from: w */
    public void m11089w(String str, String str2) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f32040Z;
        if (str2 == null) {
            sharedPreferences.edit().remove(str).apply();
        } else {
            sharedPreferences.edit().putString(str, str2).apply();
        }
    }

    /* JADX INFO: renamed from: x */
    public void m11090x() {
        C3123P c3123p = (C3123P) this.f32040Z;
        synchronized (c3123p.f9403p) {
            try {
                Integer num = (Integer) c3123p.f9403p.getAndSet(null);
                if (num == null) {
                    return;
                }
                if (num.intValue() != c3123p.m3958D()) {
                    c3123p.m3960G();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public void m11091z() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f32040Z;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + m11075B());
    }

    public /* synthetic */ C10808o(Object obj, int i10) {
        this.f32039Y = i10;
        this.f32040Z = obj;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m11072o(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", qffLJgOYizGmMj.MsYCfdoqfqXzkly)));
    }

    public /* synthetic */ C10808o(AbstractC19821f abstractC19821f, AbstractC20851a abstractC20851a, int i10) {
        this.f32039Y = i10;
        this.f32040Z = abstractC20851a;
    }

    public /* synthetic */ C10808o(C18655i c18655i) {
        this.f32039Y = 18;
        C3032c c3032c = new C3032c(c18655i, 15);
        this.f32040Z = C6149b.m6712b(new C19506i(C6149b.m6712b(new C5311e(C6149b.m6712b(new C11241l(c3032c, C6149b.m6712b(new C7296c(c3032c, 20)))), C6149b.m6712b(new C13288c(c3032c)), c3032c, 7)), 15));
    }

    public C10808o(InterfaceC11256c internalLogger) {
        this.f32039Y = 4;
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f32040Z = internalLogger;
    }

    public C10808o(Application application) {
        this.f32039Y = 23;
        if (!TextUtils.isEmpty("com.auth0.authentication.storage")) {
            SharedPreferences sharedPreferences = application.getSharedPreferences("com.auth0.authentication.storage", 0);
            AbstractC16544l.m18093f(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
            this.f32040Z = sharedPreferences;
            return;
        }
        throw new IllegalArgumentException("The SharedPreferences name is invalid.");
    }

    public C10808o(C0840x c0840x, C21585H c21585h) {
        this.f32039Y = 14;
        this.f32040Z = c0840x;
    }

    public C10808o(int i10) {
        Object c20513d;
        this.f32039Y = i10;
        switch (i10) {
            case 16:
                if (Build.VERSION.SDK_INT >= 28) {
                    c20513d = new C18639a(11);
                } else {
                    c20513d = new C20513d();
                }
                this.f32040Z = c20513d;
                break;
            case 22:
                this.f32040Z = new ArrayDeque(16);
                break;
            default:
                new LinkedHashMap();
                Charset charset = C21307a.f67720a;
                byte[] bytes = "LKFrameEncryptionKey".getBytes(charset);
                AbstractC16544l.m18093f(bytes, "getBytes(...)");
                byte[] bytes2 = "LK-ROCKS".getBytes(charset);
                AbstractC16544l.m18093f(bytes2, "getBytes(...)");
                FrameCryptorKeyProvider frameCryptorKeyProviderCreateFrameCryptorKeyProvider = FrameCryptorFactory.createFrameCryptorKeyProvider(true, bytes, 16, bytes2, -1, 16, false);
                AbstractC16544l.m18093f(frameCryptorKeyProviderCreateFrameCryptorKeyProvider, "createFrameCryptorKeyProvider(...)");
                this.f32040Z = frameCryptorKeyProviderCreateFrameCryptorKeyProvider;
                break;
        }
    }

    public C10808o(CameraCaptureSession cameraCaptureSession, Handler handler) {
        this.f32039Y = 2;
        if (Build.VERSION.SDK_INT >= 28) {
            this.f32040Z = new C0701h(cameraCaptureSession, null);
        } else {
            this.f32040Z = new C15384c(cameraCaptureSession, new C13287b(handler, 2));
        }
    }

    public C10808o(Bundle bundle) {
        this.f32039Y = 7;
        this.f32040Z = new Bundle(bundle);
    }

    public C10808o(ContentInfo contentInfo) {
        this.f32039Y = 3;
        contentInfo.getClass();
        this.f32040Z = AbstractC0259j.m843l(contentInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10808o(InterfaceC1436k interfaceC1436k) {
        this.f32039Y = 27;
        this.f32040Z = (AbstractC16546n) interfaceC1436k;
    }

    public C10808o(AbstractTextureViewSurfaceTextureListenerC6373j this$0) {
        this.f32039Y = 20;
        AbstractC16544l.m18094g(this$0, "this$0");
        this.f32040Z = this$0;
    }
}
