package kotlin.reflect.jvm.internal.impl.metadata.builtins;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import p200Hm.C3507f;
import p200Hm.C3508g;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public final class BuiltInsBinaryVersion extends BinaryVersion {
    public static final Companion Companion = new Companion(null);
    public static final BuiltInsBinaryVersion INSTANCE = new BuiltInsBinaryVersion(1, 0, 7);
    public static final BuiltInsBinaryVersion INVALID_VERSION = new BuiltInsBinaryVersion(new int[0]);

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final BuiltInsBinaryVersion readFrom(InputStream stream) {
            AbstractC16544l.m18094g(stream, "stream");
            DataInputStream dataInputStream = new DataInputStream(stream);
            C3508g c3508g = new C3508g(1, dataInputStream.readInt(), 1);
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(c3508g, 10));
            C3507f it = c3508g.iterator();
            while (it.f10596o0) {
                it.mo4199a();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] iArrM19321B0 = AbstractC17680n.m19321B0(arrayList);
            return new BuiltInsBinaryVersion(Arrays.copyOf(iArrM19321B0, iArrM19321B0.length));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuiltInsBinaryVersion(int... numbers) {
        super(Arrays.copyOf(numbers, numbers.length));
        AbstractC16544l.m18094g(numbers, "numbers");
    }

    public boolean isCompatibleWithCurrentCompilerVersion() {
        BuiltInsBinaryVersion ourVersion = INSTANCE;
        AbstractC16544l.m18094g(ourVersion, "ourVersion");
        int i10 = this.f52579c;
        int i11 = ourVersion.f52579c;
        int i12 = ourVersion.f52578b;
        int i13 = this.f52578b;
        if (i13 == 0) {
            if (i12 != 0 || i10 != i11) {
                return false;
            }
        } else if (i13 != i12 || i10 > i11) {
            return false;
        }
        return true;
    }
}
