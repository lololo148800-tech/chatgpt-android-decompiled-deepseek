package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class PredefinedFunctionEnhancementInfo {

    /* JADX INFO: renamed from: a */
    public final TypeEnhancementInfo f51993a;

    /* JADX INFO: renamed from: b */
    public final List f51994b;

    /* JADX INFO: renamed from: c */
    public final String f51995c;

    /* JADX INFO: renamed from: d */
    public final PredefinedFunctionEnhancementInfo f51996d;

    public PredefinedFunctionEnhancementInfo() {
        this(null, null, null, 7, null);
    }

    public final String getErrorsSinceLanguageVersion() {
        return this.f51995c;
    }

    public final List<TypeEnhancementInfo> getParametersInfo() {
        return this.f51994b;
    }

    public final TypeEnhancementInfo getReturnTypeInfo() {
        return this.f51993a;
    }

    public final PredefinedFunctionEnhancementInfo getWarningModeClone() {
        return this.f51996d;
    }

    public PredefinedFunctionEnhancementInfo(TypeEnhancementInfo typeEnhancementInfo, List<TypeEnhancementInfo> parametersInfo, String str) {
        AbstractC16544l.m18094g(parametersInfo, "parametersInfo");
        this.f51993a = typeEnhancementInfo;
        this.f51994b = parametersInfo;
        this.f51995c = str;
        PredefinedFunctionEnhancementInfo predefinedFunctionEnhancementInfo = null;
        if (str != null) {
            TypeEnhancementInfo typeEnhancementInfoCopyForWarnings = typeEnhancementInfo != null ? typeEnhancementInfo.copyForWarnings() : null;
            List<TypeEnhancementInfo> list = parametersInfo;
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
            for (TypeEnhancementInfo typeEnhancementInfo2 : list) {
                arrayList.add(typeEnhancementInfo2 != null ? typeEnhancementInfo2.copyForWarnings() : null);
            }
            predefinedFunctionEnhancementInfo = new PredefinedFunctionEnhancementInfo(typeEnhancementInfoCopyForWarnings, arrayList, null);
        }
        this.f51996d = predefinedFunctionEnhancementInfo;
    }

    public /* synthetic */ PredefinedFunctionEnhancementInfo(TypeEnhancementInfo typeEnhancementInfo, List list, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : typeEnhancementInfo, (i10 & 2) != 0 ? C17689w.f56480Y : list, (i10 & 4) != 0 ? null : str);
    }
}
