package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractMessageLite implements MessageLite {

    public static abstract class Builder<BuilderType extends Builder> implements MessageLite.Builder {
        @Override // 
        /* JADX INFO: renamed from: clone */
        public abstract BuilderType mo22588clone();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
        public abstract BuilderType mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        int iComputeRawVarint32Size = CodedOutputStream.computeRawVarint32Size(serializedSize) + serializedSize;
        if (iComputeRawVarint32Size > 4096) {
            iComputeRawVarint32Size = 4096;
        }
        CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputStream, iComputeRawVarint32Size);
        codedOutputStreamNewInstance.writeRawVarint32(serializedSize);
        writeTo(codedOutputStreamNewInstance);
        codedOutputStreamNewInstance.flush();
    }
}
