package p544W9;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: renamed from: W9.C3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8459C3 {
    /* JADX INFO: renamed from: a */
    public static boolean m9077a(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return true;
        }
        for (File file2 : fileArrListFiles) {
            if (!m9077a(file2)) {
                return false;
            }
        }
        return file.delete();
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m9079c(long j10, String str) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            throw new IOException(AbstractC10763a.m11054l("File '", file.getName(), "' doesn't exists"));
        }
        if (!file.isFile()) {
            throw new IOException(AbstractC10763a.m11054l("Reading path ", str, " failed, because it's not a file."));
        }
        if (!file.canRead()) {
            throw new IOException(AbstractC10763a.m11054l("Reading the item ", str, " failed, because can't read the file."));
        }
        if (file.length() > j10) {
            throw new IOException(String.format("Reading file failed, because size located at '%s' with %d bytes is bigger than the maximum allowed size of %d bytes.", str, Long.valueOf(file.length()), Long.valueOf(j10)));
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i10 = bufferedInputStream.read(bArr);
                        if (i10 == -1) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            bufferedInputStream.close();
                            fileInputStream.close();
                            return byteArray;
                        }
                        byteArrayOutputStream.write(bArr, 0, i10);
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                bufferedInputStream.close();
                throw th5;
            }
        } catch (Throwable th6) {
            try {
                fileInputStream.close();
            } catch (Throwable th7) {
                th6.addSuppressed(th7);
            }
            throw th6;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m9080d(File file) throws IOException {
        if (file == null || !file.exists() || !file.isFile() || !file.canRead()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            String line = bufferedReader.readLine();
            if (line != null) {
                sb2.append(line);
            }
            while (true) {
                String line2 = bufferedReader.readLine();
                if (line2 == null) {
                    bufferedReader.close();
                    return sb2.toString();
                }
                sb2.append(Separators.RETURN);
                sb2.append(line2);
            }
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
