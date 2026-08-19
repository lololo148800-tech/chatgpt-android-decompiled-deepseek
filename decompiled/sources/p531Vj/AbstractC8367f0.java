package p531Vj;

import android.content.Context;
import com.openai.feature.serverstatus.impl.sunset.p684ZP.VjclRfeKsMflo;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p046Bk.C1342O;
import p049Bm.InterfaceC1436k;
import p408Qj.AbstractC6743i;
import p408Qj.C6742h;
import p729ej.C13421l;
import p909nm.C17689w;
import p913o2.AbstractC17803d;

/* JADX INFO: renamed from: Vj.f0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8367f0 {

    /* JADX INFO: renamed from: a */
    public static final C1342O f26063a = new C1342O(21);

    /* JADX INFO: renamed from: a */
    public static final ArrayList m8938a(Context context, ArrayList arrayList) {
        AbstractC16544l.m18094g(context, "<this>");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            EnumC8334D permission = (EnumC8334D) obj;
            AbstractC16544l.m18094g(permission, "permission");
            if (!(AbstractC17803d.m19554a(context, m8939b(permission)) == 0)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: c */
    public static final C6742h m8940c(Object obj, C13421l context, boolean z6, EnumC8334D enumC8334D, boolean z10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C8361c0 permissionRequestWorkflow, StepStyle stepStyle, String key, InterfaceC1436k interfaceC1436k) {
        Object objMo3404p;
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(permissionRequestWorkflow, "permissionRequestWorkflow");
        AbstractC16544l.m18094g(key, "key");
        C17689w c17689w = C17689w.f56480Y;
        if (z6 && (objMo3404p = context.mo3404p(permissionRequestWorkflow, new C8351V(enumC8334D, z10, str, str2, str3, str4, str5, str6, str7, str8, stepStyle), key, interfaceC1436k)) != null) {
            return AbstractC6743i.m7187a(objMo3404p, obj, "PermissionFlowModal");
        }
        C6742h c6742h = new C6742h(obj, "PermissionFlowModal", c17689w);
        return c6742h;
    }

    /* JADX INFO: renamed from: b */
    public static final String m8939b(EnumC8334D enumC8334D) {
        AbstractC16544l.m18094g(enumC8334D, "<this>");
        int iOrdinal = enumC8334D.ordinal();
        if (iOrdinal == 0) {
            return VjclRfeKsMflo.rlamgov;
        }
        if (iOrdinal == 1) {
            return "android.permission.RECORD_AUDIO";
        }
        if (iOrdinal == 2) {
            return "android.permission.ACCESS_COARSE_LOCATION";
        }
        if (iOrdinal == 3) {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
        throw new C0644w();
    }
}
