package p727eh;

import android.app.Application;
import android.content.pm.FeatureInfo;
import android.database.CursorWindow;
import android.telephony.TelephonyManager;
import gd.C13931e0;
import gd.C13954k;
import gd.C13969n2;
import gd.C13991t0;
import gd.C14005w2;
import gd.InterfaceC13849E;
import java.lang.reflect.Field;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p025An.AbstractC0593T;
import p1081wc.C20887f;
import p1081wc.InterfaceC20904w;
import p195Hh.C3430e;
import p201Hn.C3516e;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p992ri.InterfaceC19018a;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: eh.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C13404b implements InterfaceC19018a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42462Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC13849E f42463Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f42464o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f42465p0;

    public C13404b(InterfaceC13849E interfaceC13849E, C13969n2 c13969n2) {
        this.f42462Y = 1;
        this.f42463Z = interfaceC13849E;
        this.f42464o0 = c13969n2;
        this.f42465p0 = AbstractC8168p6.m8749b("DatabaseConfigInitializer", null);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    @Override // p992ri.InterfaceC19018a
    /* JADX INFO: renamed from: a */
    public final Object mo4158a(InterfaceC18770c interfaceC18770c) {
        C13403a c13403a;
        C13404b c13404b;
        FeatureInfo featureInfo;
        switch (this.f42462Y) {
            case 0:
                if (interfaceC18770c instanceof C13403a) {
                    c13403a = (C13403a) interfaceC18770c;
                    int i10 = c13403a.f42461p0;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c13403a.f42461p0 = i10 - Integer.MIN_VALUE;
                    } else {
                        c13403a = new C13403a(this, (AbstractC19687c) interfaceC18770c);
                    }
                } else {
                    c13403a = new C13403a(this, (AbstractC19687c) interfaceC18770c);
                }
                Object objM15482b = c13403a.f42459Z;
                Object obj = EnumC19250a.f61036Y;
                int i11 = c13403a.f42461p0;
                if (i11 == 0) {
                    AbstractC9233X.m9807c(objM15482b);
                    C13931e0 c13931e0 = C13931e0.f43981c;
                    c13403a.f42458Y = this;
                    c13403a.f42461p0 = 1;
                    objM15482b = ((C14005w2) this.f42463Z).m15482b(c13931e0, c13403a);
                    if (objM15482b != obj) {
                        c13404b = this;
                    }
                    return obj;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c13404b = c13403a.f42458Y;
                AbstractC9233X.m9807c(objM15482b);
                boolean zBooleanValue = ((Boolean) objM15482b).booleanValue();
                obj = C17296C.f55119a;
                if (zBooleanValue) {
                    FeatureInfo[] systemAvailableFeatures = ((Application) c13404b.f42464o0).getPackageManager().getSystemAvailableFeatures();
                    AbstractC16544l.m18093f(systemAvailableFeatures, "getSystemAvailableFeatures(...)");
                    int length = systemAvailableFeatures.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length) {
                            featureInfo = systemAvailableFeatures[i12];
                            if (!AbstractC16544l.m18089b(featureInfo.name, "android.hardware.telephony")) {
                                i12++;
                            }
                        } else {
                            featureInfo = null;
                        }
                    }
                    if (featureInfo != null) {
                        TelephonyManager telephonyManager = (TelephonyManager) ((Application) c13404b.f42464o0).getSystemService(TelephonyManager.class);
                        if (telephonyManager.getSimState() == 5) {
                            String simOperator = telephonyManager.getSimOperator();
                            ((InterfaceC20904w) c13404b.f42465p0).mo21447a(C20887f.f66535j, AbstractC0168G.m535x("simOperator", simOperator));
                        }
                    }
                }
                return obj;
            default:
                if (((C14005w2) this.f42463Z).m15481a(C13991t0.f44058c)) {
                    try {
                        Field declaredField = CursorWindow.class.getDeclaredField("sCursorWindowSize");
                        declaredField.setAccessible(true);
                        declaredField.set(null, ((C13969n2) this.f42464o0).m15477a(C13954k.f44008d));
                    } catch (Exception e10) {
                        AbstractC8160o6.m8731f((C3430e) this.f42465p0, "Failed to set custom cursor window size", e10, null, 4);
                    }
                    break;
                }
                return C17296C.f55119a;
        }
    }

    @Override // p992ri.InterfaceC19018a
    /* JADX INFO: renamed from: b */
    public final C3516e mo4159b() {
        switch (this.f42462Y) {
            case 0:
                break;
        }
        return AbstractC0593T.f1824a;
    }

    @Override // p992ri.InterfaceC19018a
    /* JADX INFO: renamed from: c */
    public final Object mo4160c(InterfaceC18770c interfaceC18770c) {
        switch (this.f42462Y) {
            case 0:
                break;
        }
        return C17296C.f55119a;
    }

    public C13404b(Application application, InterfaceC13849E interfaceC13849E, InterfaceC20904w interfaceC20904w) {
        this.f42462Y = 0;
        this.f42464o0 = application;
        this.f42463Z = interfaceC13849E;
        this.f42465p0 = interfaceC20904w;
    }
}
