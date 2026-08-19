package kotlin.reflect.jvm.internal.impl.load.kotlin;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.parser.TokenNames;
import bn.C11512d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p658b5.p659zh.MMVKXkcLpuHFDi;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes2.dex */
public final class SignatureBuildingComponents {
    public static final SignatureBuildingComponents INSTANCE = new SignatureBuildingComponents();

    public final Set<String> inClass(String internalName, String... signatures) {
        AbstractC16544l.m18094g(internalName, "internalName");
        AbstractC16544l.m18094g(signatures, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : signatures) {
            linkedHashSet.add(internalName + '.' + str);
        }
        return linkedHashSet;
    }

    public final Set<String> inJavaLang(String name, String... signatures) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(signatures, "signatures");
        return inClass(javaLang(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public final Set<String> inJavaUtil(String name, String... signatures) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(signatures, "signatures");
        return inClass(javaUtil(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public final String javaFunction(String name) {
        AbstractC16544l.m18094g(name, "name");
        return "java/util/function/".concat(name);
    }

    public final String javaLang(String name) {
        AbstractC16544l.m18094g(name, "name");
        return "java/lang/".concat(name);
    }

    public final String javaUtil(String name) {
        AbstractC16544l.m18094g(name, "name");
        return "java/util/".concat(name);
    }

    public final String jvmDescriptor(String name, List<String> parameters, String ret) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(parameters, "parameters");
        AbstractC16544l.m18094g(ret, "ret");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name);
        sb2.append('(');
        sb2.append(AbstractC17680n.m19349Y(parameters, "", null, null, 0, null, C11512d.f34835Y, 30));
        sb2.append(')');
        if (ret.length() > 1) {
            ret = AbstractC10763a.m11047e(';', TokenNames.f32014L, ret);
        }
        sb2.append(ret);
        return sb2.toString();
    }

    public final String signature(String internalName, String jvmDescriptor) {
        AbstractC16544l.m18094g(internalName, "internalName");
        AbstractC16544l.m18094g(jvmDescriptor, "jvmDescriptor");
        return internalName + '.' + jvmDescriptor;
    }

    public final String[] constructors(String... signatures) {
        AbstractC16544l.m18094g(signatures, "signatures");
        ArrayList arrayList = new ArrayList(signatures.length);
        for (String str : signatures) {
            arrayList.add("<init>(" + str + MMVKXkcLpuHFDi.SHqb);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
