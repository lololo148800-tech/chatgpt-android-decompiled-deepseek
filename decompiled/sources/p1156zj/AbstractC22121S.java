package p1156zj;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$SupplementaryData;
import io.sentry.instrumentation.file.C15379d;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p025An.C0644w;
import p1044uj.C20360s;
import p1071w0.C20699B;
import p140Fa.C2685e;
import p149Fj.C2878l;
import p149Fj.EnumC2883q;
import p149Fj.InterfaceC2881o;
import p523V9.AbstractC7942M5;
import p523V9.AbstractC8040Z5;
import p523V9.AbstractC8215v5;
import p544W9.AbstractC8752z3;
import p581Xj.AbstractC9523a;
import p658b5.C11248s;
import p729ej.C13421l;
import p856kk.C16433a;
import p949pj.AbstractC18481o;
import p949pj.C18477m;
import p949pj.C18479n;

/* JADX INFO: renamed from: zj.S */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC22121S {

    /* JADX INFO: renamed from: a */
    public static final C20360s f69931a = new C20360s(1);

    /* JADX INFO: renamed from: a */
    public static final GradientDrawable m22364a(Context context, int i10) {
        float dimension = context.getResources().getDimension(R.dimen.pi2_overlay_corner_radius);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.pi2_overlay_stroke_width);
        int color = context.getColor(R.color.pi2_overlay_stroke_color);
        Integer numM8409e = AbstractC8040Z5.m8409e(context, i10);
        if (numM8409e != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(numM8409e.intValue(), AbstractC9523a.f28660a);
            AbstractC16544l.m18093f(typedArrayObtainStyledAttributes, "obtainStyledAttributes(resourceId, attrs)");
            dimension = typedArrayObtainStyledAttributes.getDimension(0, dimension);
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, dimensionPixelSize);
            color = typedArrayObtainStyledAttributes.getColor(1, color);
            typedArrayObtainStyledAttributes.recycle();
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setStroke(dimensionPixelSize, color);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: b */
    public static final EnumC2883q m22365b(InterfaceC22179o interfaceC22179o) {
        AbstractC16544l.m18094g(interfaceC22179o, "<this>");
        if (interfaceC22179o instanceof C22173m) {
            return EnumC2883q.f8673t0;
        }
        if (interfaceC22179o instanceof C22176n) {
            return ((C22176n) interfaceC22179o).f70230Y.f69961q0;
        }
        throw new C0644w();
    }

    /* JADX INFO: renamed from: c */
    public static final String m22366c(InterfaceC22179o interfaceC22179o) {
        AbstractC16544l.m18094g(interfaceC22179o, "<this>");
        if (interfaceC22179o instanceof C22173m) {
            return "auto-classification";
        }
        if (interfaceC22179o instanceof C22176n) {
            return ((C22176n) interfaceC22179o).f70230Y.f69957Y;
        }
        throw new C0644w();
    }

    /* JADX INFO: renamed from: d */
    public static final C22124T0 m22367d(InterfaceC22179o interfaceC22179o, EnumC22128V0 side) {
        AbstractC16544l.m18094g(interfaceC22179o, "<this>");
        AbstractC16544l.m18094g(side, "side");
        if (interfaceC22179o instanceof C22173m) {
            return ((C22173m) interfaceC22179o).f70206Y.f1659o0;
        }
        if (interfaceC22179o instanceof C22176n) {
            return ((C22176n) interfaceC22179o).f70230Y.m22373a(side);
        }
        throw new C0644w();
    }

    /* JADX INFO: renamed from: e */
    public static final C22142b1 m22368e(Context context, AbstractC22196t1 overlay) {
        int resourceId;
        int resourceId2;
        int i10;
        AbstractC16544l.m18094g(overlay, "overlay");
        C22190r1 c22190r1 = C22190r1.f70260Y;
        boolean zEquals = overlay.equals(c22190r1);
        C22193s1 c22193s1 = C22193s1.f70317Y;
        C22187q1 c22187q1 = C22187q1.f70254Y;
        C22181o1 c22181o1 = C22181o1.f70247Y;
        C22178n1 c22178n1 = C22178n1.f70245Y;
        if (zEquals) {
            resourceId = R.raw.pi2_mrz_intro_lottie;
        } else if (overlay.equals(c22178n1)) {
            resourceId = R.raw.pi2_barcode_intro_lottie;
        } else {
            if (!(overlay.equals(c22181o1) ? true : overlay instanceof C22184p1 ? true : overlay.equals(c22187q1) ? true : overlay.equals(c22193s1))) {
                throw new C0644w();
            }
            resourceId = R.raw.pi2_id_front_processing_lottie;
        }
        if (overlay.equals(c22190r1)) {
            resourceId2 = R.drawable.pi2_governmentid_passport_idguide;
        } else if (overlay.equals(c22178n1)) {
            resourceId2 = R.drawable.pi2_governmentid_barcode_idguide;
        } else if (overlay.equals(c22193s1)) {
            resourceId2 = R.drawable.pi2_governmentid_blank;
        } else if (overlay.equals(c22181o1)) {
            resourceId2 = R.drawable.pi2_governmentid_corners_only;
        } else {
            if (!(overlay instanceof C22184p1 ? true : overlay.equals(c22187q1))) {
                throw new C0644w();
            }
            resourceId2 = R.drawable.pi2_governmentid_face_with_text;
        }
        if (overlay.equals(c22190r1)) {
            i10 = R.attr.personaIdFrameMrzGuideAssets;
        } else if (overlay.equals(c22178n1)) {
            i10 = R.attr.personaIdFrameBarcodeGuideAssets;
        } else {
            if (!(overlay.equals(c22181o1) ? true : overlay instanceof C22184p1 ? true : overlay.equals(c22187q1) ? true : overlay.equals(c22193s1))) {
                throw new C0644w();
            }
            i10 = R.attr.personaIdFrameFrontGuideAssets;
        }
        Integer numM8409e = AbstractC8040Z5.m8409e(context, i10);
        if (numM8409e != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(numM8409e.intValue(), AbstractC9523a.f28661b);
            AbstractC16544l.m18093f(typedArrayObtainStyledAttributes, "obtainStyledAttributes(resourceId, attrs)");
            resourceId = typedArrayObtainStyledAttributes.getResourceId(0, resourceId);
            resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, resourceId2);
            typedArrayObtainStyledAttributes.recycle();
        }
        return new C22142b1(resourceId, resourceId2);
    }

    /* JADX INFO: renamed from: f */
    public static final void m22369f(C22195t0 renderProps, AbstractC22165j0 renderState, C13421l c13421l, C2685e videoCaptureHelper) {
        AbstractC16544l.m18094g(renderProps, "renderProps");
        AbstractC16544l.m18094g(renderState, "renderState");
        AbstractC16544l.m18094g(videoCaptureHelper, "videoCaptureHelper");
        InterfaceC22179o interfaceC22179oMo22387j = renderState.mo22387j();
        if (interfaceC22179oMo22387j instanceof C22173m) {
            c13421l.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(C22109L0.f69894s0));
        } else if (interfaceC22179oMo22387j instanceof C22176n) {
            AbstractC22120R0.m22361h(renderState, c13421l, renderProps, renderState.mo22389n(), ((C22176n) interfaceC22179oMo22387j).f70230Y, videoCaptureHelper, renderState.mo22386i(), false, null, 0, 1920);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m22370g(C22195t0 renderProps, AbstractC22165j0 renderState, C13421l c13421l, C2685e videoCaptureHelper, C11248s c11248s) {
        AbstractC16544l.m18094g(renderProps, "renderProps");
        AbstractC16544l.m18094g(renderState, "renderState");
        AbstractC16544l.m18094g(videoCaptureHelper, "videoCaptureHelper");
        InterfaceC22096F governmentId = renderState.mo22389n();
        AutoClassifyWorker$SupplementaryData autoClassifyWorker$SupplementaryData = new AutoClassifyWorker$SupplementaryData();
        boolean z6 = renderProps.f70354t.f1658Z;
        String sessionToken = renderProps.f70335a;
        AbstractC16544l.m18094g(sessionToken, "sessionToken");
        String inquiryId = renderProps.f70338d;
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        String fromStep = renderProps.f70339e;
        AbstractC16544l.m18094g(fromStep, "fromStep");
        String fromComponent = renderProps.f70340f;
        AbstractC16544l.m18094g(fromComponent, "fromComponent");
        AbstractC16544l.m18094g(governmentId, "governmentId");
        AbstractC8215v5.m8843e(c13421l, new C2878l(sessionToken, inquiryId, fromStep, fromComponent, (InterfaceC2881o) c11248s.f34081Z, governmentId, (C16433a) c11248s.f34082o0, autoClassifyWorker$SupplementaryData, renderProps.f70349o, z6), AbstractC16526C.m18075c(C2878l.class), "", new C20699B(c13421l, videoCaptureHelper, renderProps, renderState, 3));
    }

    /* JADX INFO: renamed from: h */
    public static final File m22371h(Bitmap bitmap, Context context) {
        AbstractC16544l.m18094g(context, "context");
        File file = new File(context.getCacheDir(), AbstractC0168G.m533v("persona_government_id_", System.currentTimeMillis(), ".jpg"));
        C15379d c15379dM9509d = AbstractC8752z3.m9509d(new FileOutputStream(file), file);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, c15379dM9509d);
            AbstractC7942M5.m8232a(c15379dM9509d, null);
            return file;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC7942M5.m8232a(c15379dM9509d, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static final RawExtraction m22372i(AbstractC18481o abstractC18481o) {
        AbstractC16544l.m18094g(abstractC18481o, "<this>");
        if (abstractC18481o instanceof C18477m) {
            return new RawExtraction("mrz", abstractC18481o.mo19878a());
        }
        if (abstractC18481o instanceof C18479n) {
            return new RawExtraction("pdf417", abstractC18481o.mo19878a());
        }
        throw new C0644w();
    }
}
