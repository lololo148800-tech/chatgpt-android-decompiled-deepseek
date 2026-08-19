package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import mm.C17309l;

/* JADX INFO: loaded from: classes2.dex */
public interface ContractDeserializer {
    public static final Companion Companion = Companion.f52992a;

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f52992a = new Companion();

        /* JADX INFO: renamed from: b */
        public static final ContractDeserializer$Companion$DEFAULT$1 f52993b = new ContractDeserializer$Companion$DEFAULT$1();

        public final ContractDeserializer getDEFAULT() {
            return f52993b;
        }
    }

    C17309l deserializeContractFromFunction(ProtoBuf.Function function, FunctionDescriptor functionDescriptor, TypeTable typeTable, TypeDeserializer typeDeserializer);
}
