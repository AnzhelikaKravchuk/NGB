/*
 * MIT License
 *
 * Copyright (c) 2016 EPAM Systems
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.epam.catgenome.exception;

import com.epam.catgenome.entity.gene.GeneFile;
import com.epam.catgenome.entity.reference.Chromosome;
import com.epam.catgenome.entity.track.Track;

/**
 * Source:      GeneReadingException
 * Created:     07.11.16, 16:38
 * Project:     CATGenome Browser
 * Make:        IntelliJ IDEA 14.1.4, JDK 1.8
 * <p>
 * An Exception, indicating that error occurred during reading a Gene file
 * </p>
 */
public class GeneReadingException extends FeatureFileReadingException {

    public GeneReadingException(GeneFile geneFile, Chromosome chromosome, int startIndex, int endIndex,
                                Throwable cause) {
        super(String.format("Exception while reading genes from file %d:%s, from chromosome '%s', %d:%d",
                            geneFile.getId(), geneFile.getName(), chromosome.getName(), startIndex, endIndex), cause);
    }

    public GeneReadingException(Track track, Throwable cause) {
        super(String.format("Exception while reading genes from file %d, from chromosome '%d', %d:%d",
                            track.getId(), track.getChromosome().getId(), track.getStartIndex(),
                            track.getEndIndex()), cause);
    }
}
