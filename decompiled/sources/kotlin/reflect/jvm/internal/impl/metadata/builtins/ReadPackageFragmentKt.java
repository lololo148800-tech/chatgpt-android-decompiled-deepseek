package kotlin.reflect.jvm.internal.impl.metadata.builtins;

import java.io.InputStream;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import mm.C17309l;
import p523V9.AbstractC7942M5;

/* JADX INFO: loaded from: classes2.dex */
public final class ReadPackageFragmentKt {
    public static final C17309l readBuiltinsPackageFragment(InputStream inputStream) {
        ProtoBuf.PackageFragment from;
        AbstractC16544l.m18094g(inputStream, "<this>");
        try {
            BuiltInsBinaryVersion from2 = BuiltInsBinaryVersion.Companion.readFrom(inputStream);
            if (from2.isCompatibleWithCurrentCompilerVersion()) {
                ExtensionRegistryLite extensionRegistryLiteNewInstance = ExtensionRegistryLite.newInstance();
                BuiltInsProtoBuf.registerAllExtensions(extensionRegistryLiteNewInstance);
                from = ProtoBuf.PackageFragment.parseFrom(inputStream, extensionRegistryLiteNewInstance);
            } else {
                from = null;
            }
            C17309l c17309l = new C17309l(from, from2);
            AbstractC7942M5.m8232a(inputStream, null);
            return c17309l;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC7942M5.m8232a(inputStream, th2);
                throw th3;
            }
        }
    }
}
