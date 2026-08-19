package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p732en.C13444a;

/* JADX INFO: loaded from: classes2.dex */
public class ExtensionRegistryLite {

    /* JADX INFO: renamed from: b */
    public static final ExtensionRegistryLite f52730b = new ExtensionRegistryLite(0);

    /* JADX INFO: renamed from: a */
    public final Map f52731a;

    public ExtensionRegistryLite() {
        this.f52731a = new HashMap();
    }

    public static ExtensionRegistryLite getEmptyRegistry() {
        return f52730b;
    }

    public static ExtensionRegistryLite newInstance() {
        return new ExtensionRegistryLite();
    }

    public final void add(GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension) {
        this.f52731a.put(new C13444a(generatedExtension.getContainingTypeDefaultInstance(), generatedExtension.getNumber()), generatedExtension);
    }

    public <ContainingType extends MessageLite> GeneratedMessageLite.GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(ContainingType containingtype, int i10) {
        return (GeneratedMessageLite.GeneratedExtension) this.f52731a.get(new C13444a(containingtype, i10));
    }

    public ExtensionRegistryLite(int i10) {
        this.f52731a = Collections.emptyMap();
    }
}
