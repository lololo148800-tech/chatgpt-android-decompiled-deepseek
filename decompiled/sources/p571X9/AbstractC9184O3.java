package p571X9;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import kotlin.jvm.internal.AbstractC16544l;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p493U2.C7552b;
import p919o8.C17956b;

/* JADX INFO: renamed from: X9.O3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9184O3 {
    /* JADX INFO: renamed from: a */
    public static C17956b m9740a(C3676s c3676s) {
        try {
            String name = c3676s.m4395w(DiagnosticsEntry.NAME_KEY).mo4384r();
            AbstractC16544l.m18093f(name, "name");
            return new C17956b(name);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type ActionEventActionTarget", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type ActionEventActionTarget", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type ActionEventActionTarget", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C7552b m9741b(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j10;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i10 = byteBufferDuplicate.getShort() & 65535;
        if (i10 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                j10 = -1;
                break;
            }
            int i12 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j10 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i12) {
                break;
            }
            i11++;
        }
        if (j10 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j10 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j11 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i13 = 0; i13 < j11; i13++) {
                int i14 = byteBufferDuplicate.getInt();
                long j12 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i14 || 1701669481 == i14) {
                    byteBufferDuplicate.position((int) (j12 + j10));
                    C7552b c7552b = new C7552b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    c7552b.f2088p0 = byteBufferDuplicate;
                    c7552b.f2085Y = iPosition;
                    int i15 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    c7552b.f2086Z = i15;
                    c7552b.f2087o0 = ((ByteBuffer) c7552b.f2088p0).getShort(i15);
                    return c7552b;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }
}
