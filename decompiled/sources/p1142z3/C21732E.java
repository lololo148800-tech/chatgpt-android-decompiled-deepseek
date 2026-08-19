package p1142z3;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: z3.E */
/* JADX INFO: loaded from: classes.dex */
public final class C21732E extends AbstractC21735c {

    /* JADX INFO: renamed from: q0 */
    public final int f68934q0;

    /* JADX INFO: renamed from: r0 */
    public final byte[] f68935r0;

    /* JADX INFO: renamed from: s0 */
    public final DatagramPacket f68936s0;

    /* JADX INFO: renamed from: t0 */
    public Uri f68937t0;

    /* JADX INFO: renamed from: u0 */
    public DatagramSocket f68938u0;

    /* JADX INFO: renamed from: v0 */
    public MulticastSocket f68939v0;

    /* JADX INFO: renamed from: w0 */
    public InetAddress f68940w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f68941x0;

    /* JADX INFO: renamed from: y0 */
    public int f68942y0;

    public C21732E() {
        super(true);
        this.f68934q0 = 8000;
        byte[] bArr = new byte[2000];
        this.f68935r0 = bArr;
        this.f68936s0 = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: a */
    public final long mo926a(C21743k c21743k) throws C21731D {
        Uri uri = c21743k.f68974a;
        this.f68937t0 = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f68937t0.getPort();
        m22237m();
        try {
            this.f68940w0 = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f68940w0, port);
            if (this.f68940w0.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f68939v0 = multicastSocket;
                multicastSocket.joinGroup(this.f68940w0);
                this.f68938u0 = this.f68939v0;
            } else {
                this.f68938u0 = new DatagramSocket(inetSocketAddress);
            }
            this.f68938u0.setSoTimeout(this.f68934q0);
            this.f68941x0 = true;
            m22238n(c21743k);
            return -1L;
        } catch (IOException e10) {
            throw new C21731D(2001, e10);
        } catch (SecurityException e11) {
            throw new C21731D(2006, e11);
        }
    }

    @Override // p1142z3.InterfaceC21740h
    public final void close() {
        this.f68937t0 = null;
        MulticastSocket multicastSocket = this.f68939v0;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f68940w0;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f68939v0 = null;
        }
        DatagramSocket datagramSocket = this.f68938u0;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f68938u0 = null;
        }
        this.f68940w0 = null;
        this.f68942y0 = 0;
        if (this.f68941x0) {
            this.f68941x0 = false;
            m22236l();
        }
    }

    @Override // p1142z3.InterfaceC21740h
    public final Uri getUri() {
        return this.f68937t0;
    }

    @Override // p1016t3.InterfaceC19782i
    public final int read(byte[] bArr, int i10, int i11) throws C21731D {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f68942y0;
        DatagramPacket datagramPacket = this.f68936s0;
        if (i12 == 0) {
            try {
                DatagramSocket datagramSocket = this.f68938u0;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f68942y0 = length;
                m22235g(length);
            } catch (SocketTimeoutException e10) {
                throw new C21731D(2002, e10);
            } catch (IOException e11) {
                throw new C21731D(2001, e11);
            }
        }
        int length2 = datagramPacket.getLength();
        int i13 = this.f68942y0;
        int iMin = Math.min(i13, i11);
        System.arraycopy(this.f68935r0, length2 - i13, bArr, i10, iMin);
        this.f68942y0 -= iMin;
        return iMin;
    }
}
