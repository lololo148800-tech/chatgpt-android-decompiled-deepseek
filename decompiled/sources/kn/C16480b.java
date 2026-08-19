package kn;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: kn.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C16480b implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C16480b f51120Z = new C16480b(0);

    /* JADX INFO: renamed from: o0 */
    public static final C16480b f51121o0 = new C16480b(1);

    /* JADX INFO: renamed from: p0 */
    public static final C16480b f51122p0 = new C16480b(2);

    /* JADX INFO: renamed from: q0 */
    public static final C16480b f51123q0 = new C16480b(3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f51124Y;

    public /* synthetic */ C16480b(int i10) {
        this.f51124Y = i10;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f51124Y) {
            case 0:
                Name it = (Name) obj;
                AbstractC16544l.m18094g(it, "it");
                return Boolean.TRUE;
            case 1:
                SimpleFunctionDescriptor selectMostSpecificInEachOverridableGroup = (SimpleFunctionDescriptor) obj;
                TypeIntersectionScope.Companion companion = TypeIntersectionScope.Companion;
                AbstractC16544l.m18094g(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup;
            case 2:
                PropertyDescriptor selectMostSpecificInEachOverridableGroup2 = (PropertyDescriptor) obj;
                TypeIntersectionScope.Companion companion2 = TypeIntersectionScope.Companion;
                AbstractC16544l.m18094g(selectMostSpecificInEachOverridableGroup2, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup2;
            default:
                CallableDescriptor selectMostSpecificInEachOverridableGroup3 = (CallableDescriptor) obj;
                TypeIntersectionScope.Companion companion3 = TypeIntersectionScope.Companion;
                AbstractC16544l.m18094g(selectMostSpecificInEachOverridableGroup3, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup3;
        }
    }
}
