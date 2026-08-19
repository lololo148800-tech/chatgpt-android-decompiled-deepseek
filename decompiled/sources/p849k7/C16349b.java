package p849k7;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.View;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import io.sentry.C15524y1;
import io.sentry.android.core.C15243l;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.EglThread;
import p1053v3.AbstractC20423d;
import p1053v3.C20421b;
import p1053v3.C20424e;
import p1053v3.C20425f;
import p1053v3.C20426g;
import p1073w3.AbstractC20800b;
import p1074w4.C20821d;
import p372P3.InterfaceC6333o;
import p372P3.InterfaceC6336r;
import p523V9.AbstractC7841A0;
import p547Wc.C8816z;
import p644ab.InterfaceC10532e;
import p658b5.C11238i;
import p769gj.InterfaceC14150D;
import p791hj.C14520c;
import p791hj.ViewOnAttachStateChangeListenerC14519b;
import p846k4.C16335d;
import p885m4.C17153c;
import p885m4.C17155e;
import p890mb.C17216m;
import p890mb.InterfaceC17207d;
import p890mb.InterfaceC17208e;
import p904nb.EnumC17553j;

/* JADX INFO: renamed from: k7.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16349b implements EglThread.ReleaseMonitor, InterfaceC10532e, InterfaceC17208e, InterfaceC17207d, InterfaceC14150D, InterfaceC6336r {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f50730Y;

    public /* synthetic */ C16349b(int i10) {
        this.f50730Y = i10;
    }

    @Override // p372P3.InterfaceC6336r
    /* JADX INFO: renamed from: a */
    public InterfaceC6336r mo6946a(C17155e c17155e) {
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x024c  */
    /* JADX WARN: Code duplicated, block: B:85:0x02a0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [android.text.Spannable, android.text.SpannableString] */
    @Override // p644ab.InterfaceC10532e
    /* JADX INFO: renamed from: apply */
    public Object mo22421apply(Object obj) {
        ?? r17;
        Bitmap bitmap;
        float f10;
        int i10;
        float f11;
        int i11;
        int i12;
        int i13 = 3;
        boolean z6 = true;
        switch (this.f50730Y) {
            case 3:
                Bundle bundle = (Bundle) obj;
                ?? charSequence = bundle.getCharSequence(C20421b.f64568r);
                if (charSequence != 0) {
                    ArrayList<Bundle> parcelableArrayList = bundle.getParcelableArrayList(C20421b.f64569s);
                    if (parcelableArrayList != null) {
                        charSequence = SpannableString.valueOf(charSequence);
                        for (Bundle bundle2 : parcelableArrayList) {
                            int i14 = bundle2.getInt(AbstractC20423d.f64596a);
                            int i15 = bundle2.getInt(AbstractC20423d.f64597b);
                            int i16 = bundle2.getInt(AbstractC20423d.f64598c);
                            int i17 = bundle2.getInt(AbstractC20423d.f64599d, -1);
                            Bundle bundle3 = bundle2.getBundle(AbstractC20423d.f64600e);
                            if (i17 == 1) {
                                bundle3.getClass();
                                String string = bundle3.getString(C20425f.f64601c);
                                string.getClass();
                                charSequence.setSpan(new C20425f(string, bundle3.getInt(C20425f.f64602d)), i14, i15, i16);
                            } else if (i17 == 2) {
                                bundle3.getClass();
                                charSequence.setSpan(new C20426g(bundle3.getInt(C20426g.f64605d), bundle3.getInt(C20426g.f64606e), bundle3.getInt(C20426g.f64607f)), i14, i15, i16);
                            } else if (i17 == i13) {
                                charSequence.setSpan(new C20424e(), i14, i15, i16);
                            }
                            i13 = 3;
                        }
                    }
                    r17 = charSequence;
                } else {
                    r17 = 0;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(C20421b.f64570t);
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(C20421b.f64571u);
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmapDecodeByteArray = (Bitmap) bundle.getParcelable(C20421b.f64572v);
                if (bitmapDecodeByteArray == null) {
                    byte[] byteArray = bundle.getByteArray(C20421b.f64573w);
                    if (byteArray != null) {
                        bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                        bitmap = bitmapDecodeByteArray;
                    } else {
                        bitmap = null;
                    }
                } else {
                    bitmap = bitmapDecodeByteArray;
                }
                String str = C20421b.f64574x;
                if (bundle.containsKey(str)) {
                    String str2 = C20421b.f64575y;
                    if (bundle.containsKey(str2)) {
                        f10 = bundle.getFloat(str);
                        i10 = bundle.getInt(str2);
                    } else {
                        f10 = -3.4028235E38f;
                        i10 = Integer.MIN_VALUE;
                    }
                } else {
                    f10 = -3.4028235E38f;
                    i10 = Integer.MIN_VALUE;
                }
                String str3 = C20421b.f64576z;
                int i18 = bundle.containsKey(str3) ? bundle.getInt(str3) : Integer.MIN_VALUE;
                String str4 = C20421b.f64558A;
                float f12 = bundle.containsKey(str4) ? bundle.getFloat(str4) : -3.4028235E38f;
                String str5 = C20421b.f64559B;
                int i19 = bundle.containsKey(str5) ? bundle.getInt(str5) : Integer.MIN_VALUE;
                String str6 = C20421b.f64561D;
                if (bundle.containsKey(str6)) {
                    String str7 = C20421b.f64560C;
                    if (bundle.containsKey(str7)) {
                        f11 = bundle.getFloat(str6);
                        i11 = bundle.getInt(str7);
                    } else {
                        f11 = -3.4028235E38f;
                        i11 = Integer.MIN_VALUE;
                    }
                } else {
                    f11 = -3.4028235E38f;
                    i11 = Integer.MIN_VALUE;
                }
                String str8 = C20421b.f64562E;
                float f13 = bundle.containsKey(str8) ? bundle.getFloat(str8) : -3.4028235E38f;
                String str9 = C20421b.f64563F;
                float f14 = bundle.containsKey(str9) ? bundle.getFloat(str9) : -3.4028235E38f;
                String str10 = C20421b.f64564G;
                if (bundle.containsKey(str10)) {
                    i12 = bundle.getInt(str10);
                } else {
                    i12 = -16777216;
                    z6 = false;
                }
                boolean z10 = !bundle.getBoolean(C20421b.f64565H, false) ? false : z6;
                String str11 = C20421b.f64566I;
                int i20 = bundle.containsKey(str11) ? bundle.getInt(str11) : Integer.MIN_VALUE;
                String str12 = C20421b.f64567J;
                return new C20421b(r17, alignment2, alignment4, bitmap, f10, i10, i18, f12, i19, i11, f11, f13, f14, z10, i12, i20, bundle.containsKey(str12) ? bundle.getFloat(str12) : 0.0f);
            case 4:
                C20421b c20421b = (C20421b) obj;
                c20421b.getClass();
                Bundle bundle4 = new Bundle();
                CharSequence charSequence2 = c20421b.f64577a;
                if (charSequence2 != null) {
                    bundle4.putCharSequence(C20421b.f64568r, charSequence2);
                    if (charSequence2 instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence2;
                        String str13 = AbstractC20423d.f64596a;
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        for (C20425f c20425f : (C20425f[]) spanned.getSpans(0, spanned.length(), C20425f.class)) {
                            c20425f.getClass();
                            Bundle bundle5 = new Bundle();
                            bundle5.putString(C20425f.f64601c, c20425f.f64603a);
                            bundle5.putInt(C20425f.f64602d, c20425f.f64604b);
                            arrayList.add(AbstractC20423d.m21082a(spanned, c20425f, 1, bundle5));
                        }
                        for (C20426g c20426g : (C20426g[]) spanned.getSpans(0, spanned.length(), C20426g.class)) {
                            c20426g.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt(C20426g.f64605d, c20426g.f64608a);
                            bundle6.putInt(C20426g.f64606e, c20426g.f64609b);
                            bundle6.putInt(C20426g.f64607f, c20426g.f64610c);
                            arrayList.add(AbstractC20423d.m21082a(spanned, c20426g, 2, bundle6));
                        }
                        for (C20424e c20424e : (C20424e[]) spanned.getSpans(0, spanned.length(), C20424e.class)) {
                            arrayList.add(AbstractC20423d.m21082a(spanned, c20424e, 3, null));
                        }
                        if (!arrayList.isEmpty()) {
                            bundle4.putParcelableArrayList(C20421b.f64569s, arrayList);
                        }
                    }
                }
                bundle4.putSerializable(C20421b.f64570t, c20421b.f64578b);
                bundle4.putSerializable(C20421b.f64571u, c20421b.f64579c);
                bundle4.putFloat(C20421b.f64574x, c20421b.f64581e);
                bundle4.putInt(C20421b.f64575y, c20421b.f64582f);
                bundle4.putInt(C20421b.f64576z, c20421b.f64583g);
                bundle4.putFloat(C20421b.f64558A, c20421b.f64584h);
                bundle4.putInt(C20421b.f64559B, c20421b.f64585i);
                bundle4.putInt(C20421b.f64560C, c20421b.f64590n);
                bundle4.putFloat(C20421b.f64561D, c20421b.f64591o);
                bundle4.putFloat(C20421b.f64562E, c20421b.f64586j);
                bundle4.putFloat(C20421b.f64563F, c20421b.f64587k);
                bundle4.putBoolean(C20421b.f64565H, c20421b.f64588l);
                bundle4.putInt(C20421b.f64564G, c20421b.f64589m);
                bundle4.putInt(C20421b.f64566I, c20421b.f64592p);
                bundle4.putFloat(C20421b.f64567J, c20421b.f64593q);
                Bitmap bitmap2 = c20421b.f64580d;
                if (bitmap2 != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    AbstractC20800b.m21320h(bitmap2.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                    bundle4.putByteArray(C20421b.f64573w, byteArrayOutputStream.toByteArray());
                }
                return bundle4;
            default:
                long j10 = ((C17153c) obj).f54821b;
                if (j10 == -9223372036854775807L) {
                    j10 = 0;
                }
                return Long.valueOf(j10);
        }
    }

    @Override // p372P3.InterfaceC6336r
    /* JADX INFO: renamed from: b */
    public InterfaceC6336r mo6947b(boolean z6) {
        return this;
    }

    @Override // p769gj.InterfaceC14150D
    /* JADX INFO: renamed from: c */
    public void mo3483c(View view, C8816z c8816z) {
        AbstractC16544l.m18094g(view, "view");
        ViewOnAttachStateChangeListenerC14519b viewOnAttachStateChangeListenerC14519b = new ViewOnAttachStateChangeListenerC14519b(C14520c.f45760Y);
        AbstractC7841A0.m8092d(view, viewOnAttachStateChangeListenerC14519b);
        view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC14519b);
        c8816z.invoke();
    }

    @Override // p372P3.InterfaceC6336r
    /* JADX INFO: renamed from: d */
    public InterfaceC6333o[] mo6949d(Uri uri, Map map) {
        return new InterfaceC6333o[]{new C16335d(0), new C20821d()};
    }

    @Override // p890mb.InterfaceC17208e
    /* JADX INFO: renamed from: e */
    public List mo8898e(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    /* JADX INFO: renamed from: f */
    public void m17948f(C15524y1 c15524y1) {
        SentryAndroidOptions options = (SentryAndroidOptions) c15524y1;
        AbstractC16544l.m18094g(options, "options");
        options.setDsn("https://6884768431e4ba548d58cbf3ad96e4ce@o33249.ingest.sentry.io/4506613529051136");
        options.setEnableUserInteractionTracing(true);
        options.setEnableUserInteractionBreadcrumbs(true);
        options.setAttachViewHierarchy(true);
        options.getInAppIncludes().add("com.openai");
        options.setEnvironment("production");
        options.setBeforeSend(new C15243l(options));
    }

    @Override // p890mb.InterfaceC17207d
    /* JADX INFO: renamed from: g */
    public Object mo391g(C11238i c11238i) {
        switch (this.f50730Y) {
            case 8:
                return (ScheduledExecutorService) ExecutorsRegistrar.f36842a.get();
            case 9:
                return (ScheduledExecutorService) ExecutorsRegistrar.f36844c.get();
            case 10:
                return (ScheduledExecutorService) ExecutorsRegistrar.f36843b.get();
            case 11:
                C17216m c17216m = ExecutorsRegistrar.f36842a;
                return EnumC17553j.f56156Y;
            case 12:
            default:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(c11238i);
            case 13:
                return TransportRegistrar.lambda$getComponents$0(c11238i);
            case 14:
                return TransportRegistrar.lambda$getComponents$1(c11238i);
            case 15:
                return TransportRegistrar.lambda$getComponents$2(c11238i);
        }
    }

    @Override // livekit.org.webrtc.EglThread.ReleaseMonitor
    public boolean onRelease(EglThread eglThread) {
        return EglThread.lambda$create$1(eglThread);
    }
}
