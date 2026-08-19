package android.gov.nist.javax.sdp;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import p668c.InterfaceC11550j;

/* JADX INFO: loaded from: classes.dex */
public class SdpEncoderImpl {
    public void output(InterfaceC11550j interfaceC11550j, OutputStream outputStream) throws IOException {
        if (!(outputStream instanceof ObjectOutputStream)) {
            throw new IOException("The output stream has to be an instance of ObjectOutputStream");
        }
        ObjectOutputStream objectOutputStream = (ObjectOutputStream) outputStream;
        if (interfaceC11550j == null) {
            throw new IOException("The parameter is null");
        }
        objectOutputStream.writeObject(interfaceC11550j);
    }

    public void setEncoding(String str) throws UnsupportedEncodingException {
        throw new UnsupportedEncodingException("Method not supported");
    }

    public void setRtpmapAttribute(boolean z6) {
    }

    public void setTypedTime(boolean z6) {
    }
}
