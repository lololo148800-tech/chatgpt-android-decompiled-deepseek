package p345Nm;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Nm.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C5856b implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f19156Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ KotlinBuiltIns f19157Z;

    public /* synthetic */ C5856b(KotlinBuiltIns kotlinBuiltIns, int i10) {
        this.f19156Y = i10;
        this.f19157Z = kotlinBuiltIns;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        KotlinBuiltIns kotlinBuiltIns = this.f19157Z;
        switch (this.f19156Y) {
            case 0:
                return Arrays.asList(kotlinBuiltIns.getBuiltInsModule().getPackage(StandardNames.BUILT_INS_PACKAGE_FQ_NAME), kotlinBuiltIns.getBuiltInsModule().getPackage(StandardNames.COLLECTIONS_PACKAGE_FQ_NAME), kotlinBuiltIns.getBuiltInsModule().getPackage(StandardNames.RANGES_PACKAGE_FQ_NAME), kotlinBuiltIns.getBuiltInsModule().getPackage(StandardNames.ANNOTATION_PACKAGE_FQ_NAME));
            default:
                EnumMap enumMap = new EnumMap(PrimitiveType.class);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (PrimitiveType primitiveType : PrimitiveType.values()) {
                    String strAsString = primitiveType.getTypeName().asString();
                    Name name = KotlinBuiltIns.BUILTINS_MODULE_NAME;
                    if (strAsString == null) {
                        kotlinBuiltIns.getClass();
                        KotlinBuiltIns.m18104a(47);
                        throw null;
                    }
                    SimpleType defaultType = kotlinBuiltIns.m18111e(strAsString).getDefaultType();
                    if (defaultType == null) {
                        KotlinBuiltIns.m18104a(48);
                        throw null;
                    }
                    String strAsString2 = primitiveType.getArrayTypeName().asString();
                    if (strAsString2 == null) {
                        KotlinBuiltIns.m18104a(47);
                        throw null;
                    }
                    SimpleType defaultType2 = kotlinBuiltIns.m18111e(strAsString2).getDefaultType();
                    if (defaultType2 == null) {
                        KotlinBuiltIns.m18104a(48);
                        throw null;
                    }
                    enumMap.put(primitiveType, defaultType2);
                    map.put(defaultType, defaultType2);
                    map2.put(defaultType2, defaultType);
                }
                return new C5858d(enumMap, map, map2);
        }
    }
}
